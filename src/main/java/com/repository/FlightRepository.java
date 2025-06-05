package com.repository;

import com.dto.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query(value = "SELECT * FROM flight WHERE departure_airport_id =?1 AND destination_airport_id =?2 ", nativeQuery = true)
    Optional<List<Flight>> findFlightByDepartureAndDestinationAirportId(Long departureAirportId, Long destinationAirportId);

    @Query(value = "SELECT * FROM flight WHERE flight_number =?1 ", nativeQuery = true)
    Optional<Flight> findFlightByFlightNumber(String flightNumber);

    @Query(value = "SELECT * FROM flight WHERE departure_date =?1 AND (departure_time >?2 OR departure_time <?3) ", nativeQuery = true)
    Optional<List<Flight>> findFlightByDepartureDate(String departureDate, String departureTimeStart, String departureTimeEnd);

    @Query(value = "SELECT * FROM flight WHERE id =?1 ", nativeQuery = true)
    Optional<Flight> findFlightById(Long id);
}
