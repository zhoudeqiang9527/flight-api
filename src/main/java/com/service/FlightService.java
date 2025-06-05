package com.service;

import com.dto.Flight;
import com.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;


    /**
     * 搜索航班
     *
     * @param from       出发地
     * @param to         目的地
     * @param date       日期（格式：yyyy-MM-dd）
     * @return 航班列表
     */
    public List<Flight> searchFlights(String from, String to, String date){
        List<Flight> flights = flightRepository.findFlightByDepartureDate(date,from,to).orElseThrow(()-> new NoSuchElementException("No flights found"));
        return flights;
    }

    /**
     * 获取航班详情
     *
     * @param id 航班ID
     * @return 航班详细信息
     */
     public Flight getFlightDetail(Long id){
         Flight flight = flightRepository.findFlightById(id).orElseThrow(()-> new NoSuchElementException("No flight found"));
         return flight;
     }
}
