package com.flyApp.repository;

import com.flyApp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Custom query methods if needed
}
