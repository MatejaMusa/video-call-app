package com.personalproject.videocallapp;

import com.personalproject.videocallapp.user.User;
import com.personalproject.videocallapp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			userService.register(User.builder()
					.username("Mateja")
					.email("matejamusa6@gmail.com")
					.password("mateja")
					.build());

			userService.register(User.builder()
					.username("John")
					.email("john@gmail.com")
					.password("john")
					.build());

			userService.register(User.builder()
					.username("Bob")
					.email("bob@gmail.com")
					.password("bob")
					.build());
		};
	}
}
