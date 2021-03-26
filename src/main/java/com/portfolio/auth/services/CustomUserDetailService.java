package com.portfolio.auth.services;

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

import com.portfolio.auth.CustomUserDetail;
import com.portfolio.auth.dto.AuthenticationDto;
import com.portfolio.auth.dto.AuthenticationJwtDto;
import com.portfolio.auth.dto.SignUpDto;
import com.portfolio.auth.models.User;
import com.portfolio.auth.repositories.UserRepository;

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
