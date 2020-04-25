package org.triumphxx.orderclientfeign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:20 下午
 * @desc:订单接口类
 **/
@Service
@FeignClient("order-service")
public interface OrderService {
    @RequestMapping(value = "/info",method = RequestMethod.GET)
     String info();

}
