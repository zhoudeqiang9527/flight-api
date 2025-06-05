package com.controller;

import com.dto.BookingDetailDTO;
import com.dto.Booking;
import com.dto.BookingRequestDTO;
import com.service.BookingService;

import com.util.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")

public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private  JwtUtil jwtUtil;

    /**
     * GET /api/bookings
     * 查询预订列表
     */
    @GetMapping

    public ResponseEntity<List<Booking>> getBookings(
            @RequestHeader(value = "Authorization", required = true) String authorization,
            @RequestParam String email
    ) {

        List<Booking> bookings = bookingService.getBookings(email);
        return ResponseEntity.status(HttpStatus.OK).body(bookings);
    }

    /**
     * GET /api/bookings/{id}
     * 查询预订详情
     */

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingDetail(
            @PathVariable Long id
    ) {

        Booking booking = bookingService.getBookingDetail(id);
        return ResponseEntity.ok(booking);
    }

    /**
     * POST /api/bookings
     * 创建预订
     */

    @PostMapping
    public ResponseEntity<String> createBooking(
            @RequestBody BookingRequestDTO request
    ) {
        boolean result = bookingService.createBooking(request);
        if(result){
            return ResponseEntity.status(HttpStatus.OK).body("created booking");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("insert booking failed");
        }

    }
}
