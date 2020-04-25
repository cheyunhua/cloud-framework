package org.triumphxx.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:40 上午
 * @desc:订单服务接口
 **/
@RestController
public class OrderController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String index() {
        List<ServiceInstance> instances = client.getInstances("order-service");
        for (int i = 0; i < instances.size(); i++) {
            System.out.println("/info,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        return "Hello World";
    }
}
