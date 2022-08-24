package com.wei.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {
    public static final String exchange = "my.exchange";
    public static final String routingKey = "routingkey";
    public static final String queueName = "queue";
    @Bean
    public Queue queue(){
        return new Queue(queueName);
    }
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(exchange, true, true);
    }
    @Bean
    public Binding binding(DirectExchange exchange, Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(routingKey);
    }
}
