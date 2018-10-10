package com.yff.rabbitmq;

import com.yff.ConfigServerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConfigServerApplication.class)
public class RabbitmqTest {


    @Autowired
    private AmqpTemplate template;


    @Test
    public void sendTest() {
        template.convertAndSend("queue","你好 RabbitMQ");
    }
}
