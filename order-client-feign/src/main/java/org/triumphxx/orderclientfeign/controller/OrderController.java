package org.triumphxx.orderclientfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.triumphxx.orderclientfeign.service.OrderService;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:23 下午
 * @desc:订单接口类
 **/
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "query",method = RequestMethod.GET)
    public String getInfo(){
        System.out.println("通过FeignClient方式调用服务提供者");
        return "FeignClient调用服务提供者返回的信息："+orderService.info();
    }
}
