package com.project.challengeattempt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ChallengeAttemptApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAttemptApplication.class, args);
	}

}
