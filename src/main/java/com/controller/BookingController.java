package com.controller;

import com.dto.BookingDetailDTO;
import com.dto.BookingDTO;
import com.dto.BookingRequestDTO;
import com.service.BookingService;

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

    /**
     * GET /api/bookings
     * 查询预订列表
     */
    @GetMapping

    public ResponseEntity<List<BookingDTO>> getBookings(
            @RequestHeader(value = "Authorization", required = false) String authorization,
            @RequestParam(required = false) String status,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        System.out.println("getBookings-------------");
        List<BookingDTO> bookings = bookingService.getBookings(authorization, status, page, size);
        return ResponseEntity.ok(bookings);
    }

    /**
     * GET /api/bookings/{id}
     * 查询预订详情
     */

    @GetMapping("/{id}")
    public ResponseEntity<BookingDetailDTO> getBookingDetail(
            @PathVariable Long id,
            @RequestHeader(value = "Authorization", required = false) String authorization
    ) {
        BookingDetailDTO bookingDetailDTO = bookingService.getBookingDetail(id, authorization);
        return ResponseEntity.ok(bookingDetailDTO); // 使用 ResponseEntity 包装 BookingDetailDTO
    }

    /**
     * POST /api/bookings
     * 创建预订
     */

    @PostMapping
    public ResponseEntity<BookingDetailDTO> createBooking(
            @RequestBody BookingRequestDTO request
    ) {
        BookingDetailDTO bookingDetailDTO = bookingService.createBooking(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingDetailDTO);
    }
}
