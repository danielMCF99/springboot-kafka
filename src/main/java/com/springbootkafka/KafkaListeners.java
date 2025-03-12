package com.springbootkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "example", groupId = "group1")
    void listener(String data) {
        System.out.println("Received: " + data);
    }
}
