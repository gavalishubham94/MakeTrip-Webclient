package com.BikkadIT.Client.service;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.Client.responce.Passanger;
import com.BikkadIT.Client.responce.Ticket;

@Service
public class BookTicketService {


public Ticket  getSyncTicket(Passanger passanger){
	
	
		WebClient webClient = WebClient.create();
		String url="http://localhost:7070/bookticket";
		
		System.out.println(passanger);
		
		
		Ticket ticketData =  webClient.post()
		         .uri(url)
		        // .contentType(MediaType.APPLICATION_JSON)
		         .accept(MediaType.APPLICATION_JSON)
		         .body(BodyInserters.fromValue(passanger))
		         .retrieve()
		         .bodyToMono(Ticket.class)
		         .block();

		System.out.println(ticketData);
     
		return ticketData;            
	}
	
}
