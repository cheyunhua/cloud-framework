package org.triumphxx.orderclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:52 上午
 * @desc:客户端接口
 **/
@RestController
public class ClientController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String queryOrderInfo(){
        return restTemplate.getForEntity("http://ORDER-SERVICE/info", String.class).getBody();
    }
}
