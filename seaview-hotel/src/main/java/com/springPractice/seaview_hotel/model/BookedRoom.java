package com.springPractice.seaview_hotel.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name="check_in")
	private LocalDate checkInDate;
	
	@Column(name="check_out")
	private LocalDate checkOutDate;
	
	@Column(name="guest_email")
	private String guestEmail;
	
	@Column(name="guest_fullName")
	private String guestFullName;
	
	@Column(name="adults")
	private int numberOfAdults;
	
	@Column(name="children")
	private int numberOfChildren;
	
	@Column(name="total_guest")
	private int totalNumberOfGuest;
	
	@Column(name="confirmation_code")
	private String bookingConfirmationCode;
	
	@ManyToOne(fetch = FetchType.LAZY) //this will allow to load the Room only when it is access/used, not every time.
	@JoinColumn(name="room_id")
	private Room room;
	
	public void calculateTotalNumberOfGuests() {
		this.totalNumberOfGuest=this.numberOfChildren+this.numberOfAdults;
	}
	
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
		calculateTotalNumberOfGuests();
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
		calculateTotalNumberOfGuests();
	}
	
	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
}
