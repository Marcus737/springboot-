package com.wei.producer;

import com.wei.config.ConsumerConfig;
import com.wei.config.ProducerConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageProducerImpl implements MessageProducer {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(String msg) {
        rabbitTemplate.convertAndSend(ConsumerConfig.exchange, ConsumerConfig.routingKey, msg);
    }
}
