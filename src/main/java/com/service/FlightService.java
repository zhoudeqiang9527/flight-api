package com.service;

import com.dto.AirportDTO;
import com.dto.Flight;
import com.repository.AirportRepository;
import com.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
    @Autowired
    private AirportRepository airportRepository;


    /**
     * 搜索航班
     *
     * @param from       出发地
     * @param to         目的地
     * @param defaultDate 出发日期
     * @param returnDate 返程日期
     * @return 航班列表
     */
    public List<Flight> searchFlights(String from, String to, String defaultDate,String returnDate){
        //通过出发地获得对应的机场ID
        List<AirportDTO> fromAirports = airportRepository.findAirportsByName(from);
        long fromID = 0;
        if(!fromAirports.isEmpty()){
            fromID = fromAirports.getFirst().getId();
        }
        List<AirportDTO> toAirports = airportRepository.findAirportsByName(to);
        long toID = 0;
        if(!toAirports.isEmpty()){
            toID = toAirports.getFirst().getId();
        }
        //通过目的地获得对应的机场ID
        return flightRepository.findFlights(fromID, toID, defaultDate,returnDate);
    }

    /**
     * 获取航班详情
     *
     * @param flightNumber 航班号
     * @return 航班详细信息
     */
     public Flight getFlightDetail(String flightNumber){
         return flightRepository.findFlightByFlightNumber(flightNumber).orElseThrow(()-> new RuntimeException("flight not found"));
     }
}
