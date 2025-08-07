package mateuszkocot_guard.synchronizationController.service;

import lombok.Data;
import lombok.Getter;
import mateuszkocot_guard.synchronizationController.model.Station;
import mateuszkocot_guard.synchronizationController.model.VerificationResult;
import mateuszkocot_guard.synchronizationController.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Getter
@Service
public class VerificationService {

    private final StationRepository stationRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public VerificationService(StationRepository stationRepository, RestTemplate restTemplate) {
        this.stationRepository = stationRepository;
        this.restTemplate = restTemplate;
    }


    public List<VerificationResult> runVerification() {
        System.out.println("--- Rozpoczynam weryfikację stacji ---");
        List<Station> activeStations = stationRepository.findByStatus(1);
        System.out.println("Znaleziono " + activeStations.size() + " aktywnych stacji do sprawdzenia.");

        List<VerificationResult> results = new ArrayList<>();

        for (Station station : activeStations) {
            VerificationResult result = new VerificationResult();
            result.setStationName(station.getStationName());

            try {
                Map<String, Object> apiResponse = restTemplate.getForObject(station.getApiUrl(), Map.class);

                result.setStatus("OK");
                result.setDetails("Otrzymano odpowiedź: " + apiResponse.toString());


            } catch (Exception e) {
                result.setStatus("BŁĄD");
                result.setDetails("Błąd połączenia: " + e.getMessage());
            }

            results.add(result);
        }

        System.out.println("--- Weryfikacja zakończona ---");
        return results;
    }
}