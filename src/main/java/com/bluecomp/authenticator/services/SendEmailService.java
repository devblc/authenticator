package com.bluecomp.authenticator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

		@Autowired
		private JavaMailSender javaMailSender;

		public SendEmailService() {
			super();
		}

		public SendEmailService(JavaMailSender javaMailSender) {
			super();
			this.javaMailSender = javaMailSender;
		}

		@Async
	    public void sendEmail(SimpleMailMessage email) {
	        javaMailSender.send(email);
	    }

	

}
