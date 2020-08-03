package org.triumphxx.mqserver.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author:triumphxx
 * @Date:2020/4/28
 * @Time:10:31 下午
 * @desc:消息生产者
 **/
@Component
@Slf4j
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hello rabbitmq:"+new Date();
        log.info("消息生产者发出的消息：{}",msg);
        this.rabbitTemplate.convertAndSend("hello", msg);
    }
}
