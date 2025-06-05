package com.controller;

import com.dto.Flight;
import com.service.FlightService;

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

    public ResponseEntity<List<Flight>> searchFlights(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date
    ) {
        List<Flight> flights = flightService.searchFlights(from, to, date);
        return ResponseEntity.ok(flights);
    }

    /**
     * GET /api/flights/{id}
     * 查询航班详细信息
     */

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightDetail(@PathVariable("id") Long id) {
        return ResponseEntity.ok( flightService.getFlightDetail(id));
    }
}
