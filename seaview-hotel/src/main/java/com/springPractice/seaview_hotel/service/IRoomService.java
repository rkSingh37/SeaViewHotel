package com.springPractice.seaview_hotel.service;

import java.math.BigDecimal;

import org.springframework.web.multipart.MultipartFile;

import com.springPractice.seaview_hotel.controller.Room;

public interface IRoomService {

	Room addRoom(MultipartFile photo, String roomType, BigDecimal roomPrice);

}
