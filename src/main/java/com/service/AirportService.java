package com.service;

import com.dto.AirportDTO;
import java.util.List;

public interface AirportService {
    /**
     * 获取机场列表
     *
     * @return 机场列表
     */
    List<AirportDTO> getAirports();
}
