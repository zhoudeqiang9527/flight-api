package com.service;

import com.dto.Booking;
import com.dto.BookingRequestDTO;
import com.dto.User;
import com.repository.BookingRepository;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    /**
     * 查询预订列表
     *
     * @param email 用户邮箱
     * @return 预订列表
     */
     public List<Booking> getBookings(String email){


         User user = userRepository.findByEmail(email).orElseThrow(()->new RuntimeException("User not found"));
         List<Booking> bookings = bookingRepository.findBookingByUser(user.getId()).orElseThrow(()->new RuntimeException("Booking not found by user"));
         return bookings;

     }

    /**
     * 查询预订详情
     *
     * @param id           预订 ID
     * @return 预订详细信息
     */
    public Booking getBookingDetail(Long id){
        Booking booking = bookingRepository.findBookingById(id).orElseThrow(()->new RuntimeException("Booking not found"));

        return booking;
    }

    /**
     * 创建预订
     *
     * @param request 预订请求体
     * @return 创建的预订详细信息
     */
    public Boolean createBooking(BookingRequestDTO request){
        Booking booking = new Booking();
        booking.setUser_Id(request.getUserId());
        booking.setFlight_Id(request.getFlightId());
        booking.setReference(request.getReference());
        booking.setRoute(request.getRoute());
        booking.setBooking_time(new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        booking.setStatus(request.getStatus());
        booking.setTotal_price(new BigDecimal(request.getTotalPrice()));
        bookingRepository.save(booking);
        return true;

    }
}
