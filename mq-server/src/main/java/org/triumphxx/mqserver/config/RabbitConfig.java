package org.triumphxx.mqserver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:triumphxx
 * @Date:2020/4/28
 * @Time:10:36 下午
 * @desc:RabbitMQ配置类
 **/
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
