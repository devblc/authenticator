package com.bluecomp.authenticator.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.bluecomp.authenticator.constraints.FieldMatch;


@FieldMatch(first = "password", second = "matchingPassword", message = "The password fields must match")
public class SignUpDto {	


	@NotNull(message = "Username must be informed")
    @NotEmpty(message = "User name may not empty")
    @Email(message = "User name must be valid email address")
    private String userName;
    
    
	@NotNull(message = "Password must be informed")
    @NotEmpty(message = "Password name may not empty")
    private String password;

    
    @NotNull(message = "Matching Password must be informed")
    @NotEmpty(message = "Matching Password name may not empty")
    private String matchingPassword;
    
    public SignUpDto() {
   
    }
    
    
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}


}
