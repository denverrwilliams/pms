package com.kaizen.pms.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaizen.pms.service.EmailService;

@RestController
@RequestMapping(value = "/")
public class DemoEmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value = "/demo-email")
	public String testMail() {
		
		emailService.sendSimpleMessage("KaizenTechnologies.mail@gmail.com", "test-email", "This is a test email.");
		
		return "mail sent";
	}

}
