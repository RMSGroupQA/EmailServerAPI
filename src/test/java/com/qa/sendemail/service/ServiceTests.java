package com.qa.sendemail.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@RunWith(MockitoJUnitRunner.Silent.class)
public class ServiceTests {
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@InjectMocks
	EmailServiceImpl service;
	
	@Mock
	JavaMailSender emailSender;
	
	private static final String TO_1 = "johnsmith@whatever.com";
	private static final String SUBJECT = "About your order";
	private static final String MAIL_TEXT = "Please reply";
	
	@Test
	public void sendSingleTest() {
		Mockito.doNothing().when(emailSender).send(Mockito.any(SimpleMailMessage.class));
		service.sendSimpleMessage(TO_1, SUBJECT, MAIL_TEXT);
		Mockito.verify(emailSender).send(Mockito.any(SimpleMailMessage.class));
	}
	
	
}
