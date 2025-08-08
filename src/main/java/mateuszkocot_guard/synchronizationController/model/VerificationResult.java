package mateuszkocot_guard.synchronizationController.model;

import lombok.Getter;

import java.util.List;


@Getter
public class VerificationResult {

    private String stationName;
    private String status;
    private String details;
    private List<String> missingDocuments;

    public void setStatus(String błąd) {
    }
}