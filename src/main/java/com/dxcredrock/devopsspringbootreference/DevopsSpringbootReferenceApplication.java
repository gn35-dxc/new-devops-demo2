package com.dxcredrock.devopsspringbootreference;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevopsSpringbootReferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsSpringbootReferenceApplication.class, args);
	}
	 @Bean
	    CommandLineRunner init(UserRepository userRepository) {
		 List<User> usersList = new ArrayList<>();
		 User user1 = new User("John","Smith","John@domain.com");
		 User user2 = new User("Julie","Smith","Julie@domain.com");
		 User user3 = new User("Jennifer","Smith","Jennifer@domain.com");
		 User user4 = new User("Helen","Rachel","Helen@domain.com");
		 usersList.add(user1);
		 usersList.add(user2);
		 usersList.add(user3);
		 usersList.add(user4);
		 userRepository.saveAll(usersList);
	        return args -> {
	        	userRepository.findAll().forEach(System.out::println);
	        };
	        
	    }

}
