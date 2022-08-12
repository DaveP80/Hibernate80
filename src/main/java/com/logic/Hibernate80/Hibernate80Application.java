package com.logic.Hibernate80;

import com.logic.Hibernate80.model.Users;
import com.logic.Hibernate80.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Hibernate80Application implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	public static void main(String[] args) {

		SpringApplication.run(Hibernate80Application.class, args); }

		@Override
		public void run(String... args) throws Exception

		{
			Users u1 = new Users(1L, "password", "3453");
			Users u2 = new Users(2L, "password2", "4353");
			Users u3 = new Users(3L, "password10", "5535");

			userService.save(u1);
			userService.save(u2);
			userService.save(u3);


//
//
//		userService.save(new Users(1L, "username", "3453"));
//		userService.save(new Users(2L, "username1", "4353"));
//		userService.save(new Users(3L, "username2", "5535"));

			log.info(userService.findAllUsers().toString());

	}

}
