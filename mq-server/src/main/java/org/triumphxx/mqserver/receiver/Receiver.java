package org.triumphxx.mqserver.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author:triumphxx
 * @Date:2020/4/28
 * @Time:10:34 下午
 * @desc:消息消费者
 **/
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver:"+msg);
    }
}
