package com.bluecomp.authenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bluecomp.authenticator.repositories.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AuthenticatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatorApplication.class, args);
	}

	
	
}
