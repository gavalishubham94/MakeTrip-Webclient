package com.BikkadIT.Client.conttroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Client.responce.Passanger;
import com.BikkadIT.Client.responce.Ticket;
import com.BikkadIT.Client.service.BookTicketService;

@RestController
public class TicketController {

	@Autowired
	BookTicketService bookTicketService;
	
	@PostMapping(value = "/bookticket", produces = "application/json",  consumes = "application/json")
	public ResponseEntity<Ticket> geticket(@RequestBody Passanger passanger ){
		
		System.out.println(passanger);
		Ticket ticket = bookTicketService.getSyncTicket(passanger);
		
		return new ResponseEntity<Ticket>   (ticket,HttpStatus.ACCEPTED);
	}	
} 
