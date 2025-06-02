package com.controller;

import com.dto.AirportDTO;
import com.service.AirportService;
import com.util.ResponseMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airports")

public class AirportController {


    private AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }


    /**
     * GET /api/airports
     * 查询机场列表
     */

    @GetMapping
    public ResponseEntity<ResponseMessage<List<AirportDTO>>> getAirports() {
        try {
            List<AirportDTO> airportDTOS = airportService.getAllAirports();
            if(airportDTOS.isEmpty()){
                ResponseMessage<List<AirportDTO>> badResponse = ResponseMessage.error(404, "Not Found");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(badResponse);
            }else{
                ResponseMessage<List<AirportDTO>> response = ResponseMessage.success(airportService.getAllAirports());
                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
        }catch (Exception e){
            ResponseMessage<List<AirportDTO>> badResponse = ResponseMessage.error(500, e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(badResponse);
        }


    }
}
