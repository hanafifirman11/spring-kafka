package com.spike.eventdriven.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(groupId = "kafka", topics = "pesan-saya")
    public void kafkakonsumer(String in) {
        System.out.println("Data yang ditarik : " + in);
    }

}
