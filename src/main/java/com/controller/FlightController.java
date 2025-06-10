package com.controller;

import com.dto.Flight;
import com.dto.FlightRequestDTO;
import com.service.FlightService;

import com.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    public ResponseEntity<ResponseMessage<List<Flight>>> searchFlights(
            @RequestBody FlightRequestDTO flightRequestDTO
            ) {
        List<Flight> flights = flightService.searchFlights(flightRequestDTO.getFrom(), flightRequestDTO.getTo(), flightRequestDTO.getDepartureDate());
        return ResponseEntity.ok(ResponseMessage.success("查询成功", flights));
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
