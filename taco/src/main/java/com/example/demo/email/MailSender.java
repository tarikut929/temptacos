package com.example.demo.email;

public interface MailSender {

	void send(String to, String subject, String body);

}