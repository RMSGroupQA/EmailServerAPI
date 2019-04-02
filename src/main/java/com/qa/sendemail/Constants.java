package com.qa.sendemail;

public class Constants {
	
	public final String createEmployeeMail(String forename, String surname) {
		return "Dear " + forename + " " + surname + ", \n \n"
				+ "You have created an account on the RMS System owned by QA. You can now book rooms in the offices located in \n \n"
				+ "http://52.142.151.160:80 \n \n"
				+ "RMS - Room Management System \n"
				+ "RoomManagementSystems@gmail.com";
	}
	
	public final String createBookingMail(String forename, String surname, String startTime, String room) {
		return "Dear " + forename + " " + surname + ", \n \n"
				+ "You have created a booking starting at " + startTime + " in " + room + " on the RMS System owned by QA.\n \n"
				+ "If you no longer need this room please make sure you delete your booking so other people can use it. \n \n"
				+ "http://52.142.151.160:80 \n \n"
				+ "RMS - Room Management System \n"
				+ "RoomManagementSystems@gmail.com";
	}

}
