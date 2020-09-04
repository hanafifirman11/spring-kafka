package com.spike.eventdriven.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public Controller(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/test")
    public String test(){

        for (int i = 1; i <= 10; i++) {
            this.kafkaTemplate.send("pesan-saya", "Ini Pesan ke " + i);
        }

        return "OK";
    }

}
