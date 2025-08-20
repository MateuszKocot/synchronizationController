package mateuszkocot_guard.synchronizationController.model;

import lombok.Data;

import java.util.List;

@Data
public class VerificationResult {

    private String stationName;
    private String status;
    private String details;
    private List<String> missingDocuments;

    public void setStatus(String błąd) {
    }
}