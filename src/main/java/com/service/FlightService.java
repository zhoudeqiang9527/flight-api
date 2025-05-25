package com.service;

import com.dto.FlightDTO;
import com.dto.FlightDetailDTO;
import java.util.Date;
import java.util.List;

public interface FlightService {
    /**
     * 搜索航班
     *
     * @param from       出发地
     * @param to         目的地
     * @param date       日期（格式：yyyy-MM-dd）
     * @return 航班列表
     */
    List<FlightDTO> searchFlights(String from, String to, String date);

    /**
     * 获取航班详情
     *
     * @param id 航班 ID
     * @return 航班详细信息
     */
    FlightDetailDTO getFlightDetail(Long id);
}
