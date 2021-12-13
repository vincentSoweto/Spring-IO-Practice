package com.example.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnablingScheduling
public class SchedulingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SchedulingApplication.class, args);
	}

	@Scheduled(cron = "0 * 9 * * ?")
	public void cronJobSch() throws Exception {
	}
}
