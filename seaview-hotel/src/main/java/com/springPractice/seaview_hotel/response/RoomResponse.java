package com.springPractice.seaview_hotel.response;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;

//this is Room DTO (the info we want the frontend to show)
@Data
public class RoomResponse {
private Long id;
	
	private String roomType;
	
	private BigDecimal roomPrice;
	
	private boolean isBooked=false;
	
	private String photo;
	
	private List<BookingResponse> bookings;
	

	public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoBytes,
			List<BookingResponse> bookings) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = photoBytes!=null?Base64.encodeBase64String(photoBytes):null;
		this.bookings = bookings;
	}



	public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}
	
	
}
