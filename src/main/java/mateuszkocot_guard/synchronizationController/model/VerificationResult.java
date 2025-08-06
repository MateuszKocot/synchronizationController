package mateuszkocot_guard.synchronizationController.model;

import java.util.List;

public class VerificationResult {

    private String stationName;
    private String status;
    private String details;
    private List<String> missingDocuments;


    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getMissingDocuments() {
        return missingDocuments;
    }

    public void setMissingDocuments(List<String> missingDocuments) {
        this.missingDocuments = missingDocuments;
    }
}