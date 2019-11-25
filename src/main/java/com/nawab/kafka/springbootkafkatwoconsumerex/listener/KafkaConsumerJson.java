package com.nawab.kafka.springbootkafkatwoconsumerex.listener;

import com.nawab.kafka.springbootkafkatwoconsumerex.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerJson {


    @KafkaListener(topics = "first_topic", groupId = "group_id3",containerFactory = "kafkaListenerJsonContainerFactory")
    public void consume(User user){
        System.out.println("Json Consumer message came = " + user);
    }
}