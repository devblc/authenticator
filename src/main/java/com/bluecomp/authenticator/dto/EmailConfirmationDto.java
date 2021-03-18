package com.bluecomp.authenticator.dto;

import javax.validation.constraints.Email;

public class EmailConfirmationDto {

	@Email
	private String email;
	
	public EmailConfirmationDto() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
