package com.cetpa.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController 
{
	@Autowired
	private KafkaService kafkaService;
	@PostMapping("/update")
	public ResponseEntity<?> updateLoactaion()
	{
		this.kafkaService.UpdateLocation(Math.random()+","+Math.random());
		return new  ResponseEntity<>(Map.of("Message","Location updated"),HttpStatus.OK);
		//this above message goes to client;
	}

}
