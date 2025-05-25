package com.controller;

import com.dto.AirportDTO;
import com.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    /**
     * GET /api/airports
     * 查询机场列表
     */
    @GetMapping
    public List<AirportDTO> getAirports() {
        return airportService.getAirports();
    }
}
