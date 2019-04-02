package com.qa.sendemail.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
	
	public void sendSimpleMessage(String to, String subject, String text);


}
