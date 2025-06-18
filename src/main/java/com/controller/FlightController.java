package com.controller;

import com.dto.Flight;
import com.dto.FlightResponseDTO;
import com.service.FlightService;

import com.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/flights")

public class FlightController {

    @Autowired
    private FlightService flightService;

    /**
     * GET /api/flights
     * 查询航班列表
     */
    @GetMapping

    public ResponseEntity<ResponseMessage<List<FlightResponseDTO>>> searchFlights(
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("departureDate") String defaultDate,
            @RequestParam("returnDate") String returnDate) {

        List<Flight> flights = flightService.searchFlights(from, to, defaultDate, returnDate);
        List<FlightResponseDTO> flightResponseDTOS = new ArrayList<>();
        for (Flight flight : flights) {
            FlightResponseDTO flightResponseDTO = new FlightResponseDTO();
            flightResponseDTO.setId(flight.getId());
            flightResponseDTO.setFlight_number(flight.getFlightNumber());
            flightResponseDTO.setDeparture(from);
            flightResponseDTO.setArrival(to);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime startTime = LocalDateTime.parse(flight.getDepartureDate() + " " + flight.getDepartureTime(), formatter);
            LocalDateTime endTime = startTime.plusHours(4);
            flightResponseDTO.setDepartureTime(startTime.format(formatter));
            flightResponseDTO.setArrivalTime(endTime.format(formatter));
            flightResponseDTO.setDuration("4小时");
            flightResponseDTO.setStops("无");
            flightResponseDTO.setPrice(flight.getPrice().toString());
            flightResponseDTOS.add(flightResponseDTO);

        }
        return ResponseEntity.ok(ResponseMessage.success("查询成功", flightResponseDTOS));
    }

    /**
     * GET /api/flights/{flight_number}
     * 查询航班详细信息
     */

    @GetMapping("/{flight_number}")
    public ResponseEntity<ResponseMessage<Flight>> getFlightDetail(@PathVariable("flight_number") String flightNumber) {
        Flight flight = flightService.getFlightDetail(flightNumber);
        return ResponseEntity.ok(ResponseMessage.success("查询成功", flight));
    }
}
