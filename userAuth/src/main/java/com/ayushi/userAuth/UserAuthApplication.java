package com.ayushi.userAuth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ayushi.userAuth.dao.User;
import com.ayushi.userAuth.repository.UserRepository;

@SpringBootApplication
public class UserAuthApplication implements CommandLineRunner{

	private final UserRepository userRepository;

    public UserAuthApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(UserAuthApplication.class, args);
	}
	
	 @Override
	 public void run(String... args) throws Exception {
       User user=new User();
       user.setUsername("admin");
	   user.setPassword(new BCryptPasswordEncoder().encode("password"));
	   user.setAdmin(true);
	   user.setConfirmed(true);
	   userRepository.save(user);

	 }

}
