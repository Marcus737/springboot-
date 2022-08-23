package com.wei.producer;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

@Service
public class MessageProducerImpl implements MessageProducer {

    @Resource
    JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    Queue queue;

    @Override
    public void send(String msg) {
        jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }
}
