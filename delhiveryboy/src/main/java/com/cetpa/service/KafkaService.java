package com.cetpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cetpa.config.AppConstant;



@Service
public class KafkaService 
{
	private Logger logger=LoggerFactory.getLogger(KafkaService.class);
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
  public boolean UpdateLocation(String location)
  {
	  this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);
	  this.logger.info("message Produced");
	  //this message goes on server
	  //System.out.println("Message Produced");
	  return true;
	  
	  
  }
}
