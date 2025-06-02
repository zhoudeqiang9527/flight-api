package com.repository;

import com.dto.AirportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class AirportRepository  extends BaseRepository<AirportDTO> {
    public String select_sql = "SELECT * FROM airports";

    @Autowired
    public AirportRepository() throws SQLException {
    }

    public List<AirportDTO> findAllAirports() {
        // Test Data creation
        List<AirportDTO> airportDTOList = new ArrayList<>();

        AirportDTO airportDTO = new AirportDTO();
        airportDTO.setCity("beijing");
        airportDTO.setName("Beijing Capital International Airport");
        airportDTO.setCode("BJS");

        airportDTOList.add(airportDTO);

        airportDTO = new AirportDTO();
        airportDTO.setCity("tokyo");
        airportDTO.setName("Tokyo International Airport");
        airportDTO.setCode("HND");

        airportDTOList.add(airportDTO);

        airportDTO = new AirportDTO();
        airportDTO.setCity("new york");
        airportDTO.setName("John F Kennedy International Airport");
        airportDTO.setCode("JFK");

        airportDTOList.add(airportDTO);

        return airportDTOList;


        //return findAll(select_sql, AirportDTO.class);
    }
}
