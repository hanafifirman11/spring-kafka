package com.spike.eventdriven.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {

    @KafkaListener(id = "kafka", topics = "pesan-saya")
    public void kafkakonsumer(String in) {
        System.out.println("Data yang ditarik : " + in);
    }

}
