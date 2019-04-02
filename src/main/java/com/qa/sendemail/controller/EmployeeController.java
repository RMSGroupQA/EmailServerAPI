package com.qa.sendemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.sendemail.Constants;
import com.qa.sendemail.domain.Employee;
import com.qa.sendemail.service.EmailService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	private Constants cons = new Constants();
	
	@Autowired
	private EmailService service;
	
	@PostMapping("/sendCreateEmployee")
	public void createEmployeeEmail(@RequestBody Employee employee) {
		service.sendSimpleMessage(employee.getEmail() + ".com", "RMS Account Created", cons.createEmployeeMail(employee.getForename(), employee.getLastname()));
	}

}
