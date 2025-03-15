package com.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("example", "Hello World, this is my first kafka template");
			/*for (int i = 0; i < 10000; i++) {
				kafkaTemplate.send("example", "Produced Message number: " + i);
			}
		};
	}*/
}
