package com.example.web.mq;

/**
 * Created by Administrator on 2017/3/25.
 */
import javax.jms.Destination;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service("producer")
public class Producer {
    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    // 发送消息，message是待发送的消息
    public void sendMessage( String message){
        jmsTemplate.convertAndSend(queue, message);
    }
}