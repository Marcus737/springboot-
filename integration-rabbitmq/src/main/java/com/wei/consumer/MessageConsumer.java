package com.wei.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = "queue")
    public void receive(String text){
        System.out.println("收到消息：" + text);
    }
}
