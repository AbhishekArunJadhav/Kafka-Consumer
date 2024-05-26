package com.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger log = LoggerFactory.getLogger(KafkaMessageListenerContainer.class);

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume1(String msg){
        log.info("Consumer_ONE message : {}"+msg);
    }

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume2(String msg){
        log.info("Consumer_TWO message : {}"+msg);
    }

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume3(String msg){
        log.info("Consumer_THREE message : {}"+msg);
    }

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume4(String msg){
        log.info("Consumer_FOUR message : {}"+msg);
    }

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume5(String msg){
        log.info("Consumer_FIVE message : {}"+msg);
    }

    @KafkaListener(topics = "Spring_created_Topic",groupId = "consumer-group")
    public void consume6(String msg){
        log.info("Consumer_SIX message : {}"+msg);
    }

}
