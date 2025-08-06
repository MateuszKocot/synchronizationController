package mateuszkocot_guard.synchronizationController.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "STACJA")
public class Station {

    @Id
    @Column(name = "STACJAID")
    private Long id;

    @Column(name = "NAZWA")
    private String stationName;

    @Column(name = "API_URL")
    private String apiUrl;

    @Column(name = "AKTYWNY")
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}