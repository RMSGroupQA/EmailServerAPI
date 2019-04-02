package com.qa.sendemail.booking;

import java.util.Optional;

import com.qa.sendemail.domain.Booking;

public class BookingConstants {
	
	public static final Booking MOCK_BOOKING = new Booking();
	public static final Optional<Booking> MOCK_LIST = Optional.of(MOCK_BOOKING);
	
	public static final long ID = 1L;
	public static final String END_TIME = "9:00";
	public static final String CREATE_BOOKING_MESSAGE = "Booking has been successfully created.";
	public static final String UPDATE_BOOKING_MESSAGE = "End time has been changed.";
	public static final String DELETE_BOOKING_MESSAGE = "Booking deleted.";
	public static final String UNSUCCESSFUL_BOOKING_MESSAGE = "Booking doesn't exist.";

}
