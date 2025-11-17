package com.flightapp.repositories;

import com.flightapp.entities.FlightInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightInventoryRepository extends JpaRepository<FlightInventory, Long> {
    List<FlightInventory> findByFromPlaceAndToPlaceAndDepartureTimeBetween(String fromPlace, String toPlace, LocalDateTime start, LocalDateTime end);
}
