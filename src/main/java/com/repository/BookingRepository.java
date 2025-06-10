package com.repository;

import com.dto.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query(value = "SELECT * FROM Booking b WHERE b.user_Id =?1", nativeQuery = true)
    Optional<List<Booking>> findBookingByUser(Long user_Id);

    @Query(value = "SELECT * FROM Booking b WHERE b.flight_Id =?1", nativeQuery = true)
    Optional<Booking> findBookingByFlight(Long flight_Id);

    @Query(value = "SELECT * FROM Booking b WHERE b.id =?1", nativeQuery = true)
    Optional<Booking> findBookingById(Long id);

    @Query(value = "SELECT * FROM Booking b ", nativeQuery = true)
    Optional<List<Booking>> findAllBookings();
}
