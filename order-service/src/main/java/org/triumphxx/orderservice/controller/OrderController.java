package org.triumphxx.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.triumphxx.orderservice.service.OrderService;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:40 上午
 * @desc:订单服务接口
 **/
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String index() {
        return orderService.queryOrderInfo();
    }
}
