package com.springbootkafka;

import com.springbootkafka.dto.MessageRequest;
import com.springbootkafka.entity.Message;
import com.springbootkafka.repository.MessageRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    private final MessageRepository messageRepository;

    public KafkaListeners(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "group1", containerFactory = "factory")
    void listener(MessageRequest messageRequest) {

        System.out.println("Received: " + messageRequest.message());

        Message message = new Message();
        message.setMessage(messageRequest.message());

        messageRepository.save(message);
        System.out.println("Message was saved in the database");
    }
}
