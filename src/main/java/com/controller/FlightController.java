package com.controller;

import com.dto.FlightDTO;
import com.dto.FlightDetailDTO;
import com.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
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

    public List<FlightDTO> searchFlights(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date
    ) {
        return flightService.searchFlights(from, to, date);
    }

    /**
     * GET /api/flights/{id}
     * 查询航班详细信息
     */

    @GetMapping("/{id}")
    public FlightDetailDTO getFlightDetail(@PathVariable("id") Long id) {
        return flightService.getFlightDetail(id);
    }
}
