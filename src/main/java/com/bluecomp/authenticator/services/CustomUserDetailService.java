package com.bluecomp.authenticator.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bluecomp.authenticator.CustomUserDetail;
import com.bluecomp.authenticator.dto.AuthenticationDto;
import com.bluecomp.authenticator.dto.AuthenticationJwtDto;
import com.bluecomp.authenticator.dto.SignUpDto;
import com.bluecomp.authenticator.models.User;
import com.bluecomp.authenticator.repositories.UserRepository;

@Service
public class CustomUserDetailService  implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> user = userRepository.findByUserName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
		
		return user.map(CustomUserDetail::new).get();
		
	
	}
	
	public User getUserById() {  
	    
		Optional<User> userExist = userRepository.findByUserName("dba");
	    
	    return (userExist).get();

	}



}
