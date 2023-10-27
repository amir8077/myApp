package com.flyApp.repository;

import com.flyApp.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    // Custom query methods if needed
}
