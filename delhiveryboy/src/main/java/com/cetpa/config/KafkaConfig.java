package com.cetpa.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig 
{
	//NewTopic is predefine class
	@Bean
	public NewTopic topic()
	{
		
		return TopicBuilder
				.name("LOCATION_TOPIC_NAME")
		   //	.partitions()
			//	.replicas()
				.build();
	}

}
