package com.BikkadIT.Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.Client.service.BookTicketService;

@SpringBootApplication
public class BookTicketClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookTicketClientApplication.class, args);
		
		////BookTicketService bookTicketService = context.getBean(BookTicketService.class);
		//bookTicketService.getSyncFlight();
	}

}
