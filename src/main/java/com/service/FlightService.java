package com.service;

import com.dto.FlightDTO;
import com.dto.FlightDetailDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Service
public class FlightService {
    /**
     * 搜索航班
     *
     * @param from       出发地
     * @param to         目的地
     * @param date       日期（格式：yyyy-MM-dd）
     * @return 航班列表
     */
    public List<FlightDTO> searchFlights(String from, String to, String date){
        List<FlightDTO> flights = new ArrayList<>();
        FlightDTO flight = new FlightDTO(1L, "MU501", "北京", "上海", new Date(), "09:00", 10000.0);
        flights.add(flight);
        FlightDTO flight2 = new FlightDTO(2L, "MU502", "上海", "北京", new Date(), "10:00", 12000.0);
        flights.add(flight2);
        return flights;

    }

    /**
     * 获取航班详情
     *
     * @param id 航班 ID
     * @return 航班详细信息
     */
     public FlightDetailDTO getFlightDetail(Long id){
         FlightDetailDTO flightDetail = new FlightDetailDTO(1L, "MU501", "北京", "上海", new Date(), "09:00", 10000.0, Arrays.asList("A1", "A2", "A3"), "MU");
          return flightDetail;
     }
}
