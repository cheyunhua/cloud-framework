package org.triumphxx.orderclientribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.triumphxx.orderclientribbon.service.ClientService;

/**
 * @author:triumphxx
 * @Date:2020/4/25
 * @Time:11:52 上午
 * @desc:客户端接口
 **/
@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String queryOrderInfo(){
        return clientService.queryOrderInfo();
    }
}
