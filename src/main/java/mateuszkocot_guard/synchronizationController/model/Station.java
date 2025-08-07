package mateuszkocot_guard.synchronizationController.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
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

}