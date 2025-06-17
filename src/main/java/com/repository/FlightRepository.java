package com.repository;

import com.dto.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FlightRepository{
    private final JdbcTemplate jdbcTemplate;

    public FlightRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Flight> findFlights(Long departureAirportID, Long arrivalAirportID,
                                    String departureTime) {

        StringBuilder sql = new StringBuilder("SELECT * FROM flight WHERE 1=1");
        List<Object> params = new ArrayList<>();

        if (departureAirportID != null && departureAirportID != 0) {
            sql.append(" AND departure_airport_id = ?");
            params.add(departureAirportID);
        }

        if (arrivalAirportID != null && arrivalAirportID != 0) {
            sql.append(" AND destination_airport_id = ?");
            params.add(arrivalAirportID);
        }

        if (departureTime != null && !departureTime.isEmpty()) {
            sql.append(" AND DATE_FORMAT(departure_date, '%Y/%m/%d') = DATE_FORMAT(?, '%Y/%m/%d')");
            params.add(departureTime);
        }

        return jdbcTemplate.query(
                sql.toString(),
                (rs, rowNum) -> {
                    Flight flight = new Flight();
                    flight.setId(rs.getLong("id"));
                    flight.setFlightNumber(rs.getString("flight_number"));
                    flight.setDepartureAirportId(rs.getLong("departure_airport_id"));
                    flight.setDestinationAirportId(rs.getLong("destination_airport_id"));
                    flight.setDepartureDate(rs.getString("departure_date"));
                    flight.setDepartureTime(rs.getString("departure_time"));
                    flight.setPrice(rs.getBigDecimal("price"));
                    return flight;
                },
                params.toArray() // 只传入真正需要的参数
        );
    }

    // 按照航班号查询航班信息
    public Optional<Flight> findFlightByFlightNumber(String flightNumber) {
        String sql = "SELECT * FROM flight WHERE flight_number = ?";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Flight flight = new Flight();
            flight.setId(rs.getLong("id"));
            flight.setFlightNumber(rs.getString("flight_number"));
            flight.setDepartureAirportId(rs.getLong("departure_airport_id"));
            flight.setDestinationAirportId(rs.getLong("destination_airport_id"));
            flight.setDepartureDate(rs.getString("departure_date"));
            flight.setDepartureTime(rs.getString("departure_time"));
            flight.setPrice(rs.getBigDecimal("price"));
            return flight;
        }, flightNumber).stream().findFirst();
    }


}
