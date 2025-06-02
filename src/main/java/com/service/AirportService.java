package com.service;

import com.dto.AirportDTO;
import com.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    private AirportRepository airportRepository;
    @Autowired
    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<AirportDTO> getAllAirports() {
        return airportRepository.findAllAirports();
    }



}
