package com.service;

import com.dto.BookingDetailDTO;
import com.dto.BookingDTO;
import com.dto.BookingRequestDTO;

import java.util.List;

public interface BookingService {
    /**
     * 查询预订列表
     *
     * @param authorization 授权头
     * @param status       预订状态（可选）
     * @param page         分页页码
     * @param size         分页大小
     * @return 预订列表
     */
    List<BookingDTO> getBookings(String authorization, String status, int page, int size);

    /**
     * 查询预订详情
     *
     * @param id           预订 ID
     * @param authorization 授权头
     * @return 预订详细信息
     */
    BookingDetailDTO getBookingDetail(Long id, String authorization);

    /**
     * 创建预订
     *
     * @param request 预订请求体
     * @return 创建的预订详细信息
     */
    BookingDetailDTO createBooking(BookingRequestDTO request);
}
