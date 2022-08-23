package com.wei.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @JmsListener(destination = "msg.queue")
    public void receive(String text){
        System.out.println("收到消息：" + text);
    }
}
