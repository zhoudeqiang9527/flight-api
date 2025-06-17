package com.repository;

import com.dto.AirportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface AirportRepository  extends JpaRepository<AirportDTO, Long> {
    @Query(value = "SELECT * FROM airport", nativeQuery = true)
    List<AirportDTO> findAllAirports();

    @Query(value = "SELECT * FROM airport WHERE code = ?1", nativeQuery = true)
    AirportDTO findAirportByCode(String code);

    @Query(value = "SELECT * FROM airport WHERE name LIKE %?1%", nativeQuery = true)
    List<AirportDTO> findAirportsByName(String name);

}
