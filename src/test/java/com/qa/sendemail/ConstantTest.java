package com.qa.sendemail;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConstantTest {
	
	Constants cons = new Constants();
	
	@Test
	public void bookingMessageTest() {
		assertEquals("Dear Bruno Sterner, \n \n"
				+ "You have created a booking starting at Mon Apr 01 2019 15:00 in Floor 4 Room 5 on the RMS System owned by QA.\n \n"
				+ "If you no longer need this room please make sure you delete your booking so other people can use it. \n \n"
				+ "http://52.142.151.160:80 \n \n"
				+ "RMS - Room Management System \n"
				+ "RoomManagementSystems@gmail.com", cons.createBookingMail("Bruno", "Sterner", "Mon Apr 01 2019 15:00", "Floor 4 Room 5"));
	}
	
	@Test
	public void employeeMessageTest() {
		assertEquals("Dear Bruno Sterner, \n \n"
				+ "You have created an account on the RMS System owned by QA. You can now book rooms in the offices located in \n \n"
				+ "http://52.142.151.160:80 \n \n"
				+ "RMS - Room Management System \n"
				+ "RoomManagementSystems@gmail.com", cons.createEmployeeMail("Bruno", "Sterner"));
	}

}
