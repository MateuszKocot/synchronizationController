package mateuszkocot_guard.synchronizationController.repository;

import mateuszkocot_guard.synchronizationController.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {

    List<Station> findByStatus(int status);
}