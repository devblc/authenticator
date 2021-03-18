package com.bluecomp.authenticator.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.bluecomp.authenticator.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {


	Optional<User> findByUserName(String userName);
	


}