package com.flyApp.repository;

import com.flyApp.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    // Custom query methods if needed
}

