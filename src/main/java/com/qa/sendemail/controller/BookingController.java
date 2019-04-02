package com.qa.sendemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.sendemail.Constants;
import com.qa.sendemail.domain.Booking;
import com.qa.sendemail.service.EmailService;

@RestController
public class BookingController {

	@Autowired
	private EmailService service;
	
	private Constants cons = new Constants();

	@PostMapping("/sendCreateBooking")
	public void createBookingEmail(@RequestBody Booking booking) {
		service.sendSimpleMessage(booking.getEmployee().getEmail() + ".com", "RMS Booking Created",
				cons.createBookingMail(booking.getEmployee().getForename(), booking.getEmployee().getLastname(),
						booking.getStartTime().substring(0, 20),
						booking.getRoom().getFloor() + " " + booking.getRoom().getRoomName()));
	}

}
