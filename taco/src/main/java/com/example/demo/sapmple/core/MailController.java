package com.example.demo.sapmple.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.email.MailSender;
import com.example.demo.email.sendEmail;

@RestController
public class MailController {
	MailSender mailSender = new sendEmail();
	
	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("tariku@gmail.com", "Please","please");
		return("Mail sent");
}
}