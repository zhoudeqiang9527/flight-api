package com.repository;

import com.dto.AirportDTO;

import java.sql.SQLException;
import java.util.List;

public class AirportRepository  extends BaseRepository<AirportDTO> {
    public String select_sql = "SELECT * FROM airports";

    public AirportRepository() throws SQLException {
    }

    public List<AirportDTO> findAllAirports() {
        return findAll(select_sql, AirportDTO.class);
    }
}
