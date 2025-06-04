package com.repository;

import com.dto.PassengerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class PassengerRepository extends BaseRepository<PassengerDTO> {
    public String select_sql = "SELECT * FROM airports";

    public PassengerDTO getPassengerByEmail(String email) {
        PassengerDTO passenger = new PassengerDTO();

        //設置假數據
        passenger.setEmail(email);
        passenger.setFirstName("John");

        return passenger;

    }
}
