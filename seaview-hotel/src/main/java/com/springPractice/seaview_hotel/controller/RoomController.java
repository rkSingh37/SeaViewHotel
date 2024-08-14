package com.springPractice.seaview_hotel.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springPractice.seaview_hotel.response.RoomResponse;
import com.springPractice.seaview_hotel.service.IRoomService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoomController {

	// we will define the interface here
	IRoomService service;

	// we will define the controller
	public ResponseEntity<RoomResponse> addNewRoom(@RequestParam("photo") MultipartFile photo,
			@RequestParam("roomType") String roomType, @RequestParam("roomPrice") BigDecimal roomPrice) {
		Room room=service.addRoom(photo, roomType, roomPrice);
	}
}
