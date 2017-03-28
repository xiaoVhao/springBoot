package com.example;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.Queue;

/**
 * Created by Administrator on 2017/3/25.
 */
@Configuration
public class ActiveMqConfig {
    @Bean
    public ActiveMQConnectionFactory connectionFactory() {
//此链接信息可放入配置文件中
        return new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
    }

    @Bean
    public JmsMessagingTemplate jmsMessagingTemplate(ActiveMQConnectionFactory connectionFactory){
        System.out.println("get JmsMessagingTemplate");
        return new JmsMessagingTemplate(connectionFactory);
    }

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("queue1");
    }

}
