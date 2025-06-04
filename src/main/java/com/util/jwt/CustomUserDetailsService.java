package com.util.jwt;

import com.dto.PassengerDTO;
import com.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Primary
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public CustomUserDetailsService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        PassengerDTO passenger = passengerRepository.getPassengerByEmail(username);
        if (passenger == null) {
            return null;
        }
        return new org.springframework.security.core.userdetails.User(passenger.getEmail(), passenger.getPassword(), new ArrayList<>());

    }
}
