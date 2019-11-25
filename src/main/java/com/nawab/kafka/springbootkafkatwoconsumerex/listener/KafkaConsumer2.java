package com.nawab.kafka.springbootkafkatwoconsumerex.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer2 {


    @KafkaListener(topics = "first_topic", groupId = "group_id2")
    public void consume(String message){
        System.out.println("Consumer 2 message came = " + message);
    }
}