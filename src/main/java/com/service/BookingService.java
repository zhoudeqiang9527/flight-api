package com.service;

import com.dto.BookingDetailDTO;
import com.dto.BookingDTO;
import com.dto.BookingRequestDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class BookingService {
    /**
     * 查询预订列表
     *
     * @param authorization 授权头
     * @param status       预订状态（可选）
     * @param page         分页页码
     * @param size         分页大小
     * @return 预订列表
     */
     public List<BookingDTO> getBookings(String authorization, String status, int page, int size){
         List<BookingDTO> bookings =  new ArrayList<>();
         BookingDTO booking = new BookingDTO("123456", "Shanghai-Beijing", new Date(), "Confirmed");
         bookings.add(booking);
         BookingDTO booking2 = new BookingDTO("654321", "Beijing-Shanghai", new Date(), "Confirmed");
         bookings.add(booking2);
         return bookings;

     }

    /**
     * 查询预订详情
     *
     * @param id           预订 ID
     * @param authorization 授权头
     * @return 预订详细信息
     */
    public BookingDetailDTO getBookingDetail(Long id, String authorization){
        BookingDetailDTO bookingDetail = new BookingDetailDTO("123456", new ArrayList<>(), 1000.0, "Shanghai-Beijing", new Date(), "Confirmed");
        return bookingDetail;
    }

    /**
     * 创建预订
     *
     * @param request 预订请求体
     * @return 创建的预订详细信息
     */
    public BookingDetailDTO createBooking(BookingRequestDTO request){
        BookingDetailDTO bookingDetail = new BookingDetailDTO("123456", new ArrayList<>(), 1000.0, "Shanghai-Beijing", new Date(), "Confirmed");
        return bookingDetail;
    }
}
