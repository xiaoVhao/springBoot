package com.example;

import com.example.web.mq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

/**
 * Created by Administrator on 2017/3/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsApplicationTests {
    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() throws InterruptedException {

        for(int i=0; i<100; i++){
            producer.sendMessage( "myname is chhliu!!!");
        }
    }

}
