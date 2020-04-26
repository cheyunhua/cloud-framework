package org.triumphxx.orderclientribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:7:00 下午
 * @desc:客户端服务类
 **/
@Service
public class ClientService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String queryOrderInfo(){
        System.out.println("通过restTemplate访问服务提供者");
        return restTemplate.getForEntity("http://ORDER-SERVICE/info", String.class).getBody();
    }

    /**
     * 服务发生故障是返回给客户端的消息
     * @return
     */
    public String error(){
        return "您调用的服务以下线";
    }
}
