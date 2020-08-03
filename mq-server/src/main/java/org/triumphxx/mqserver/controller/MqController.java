package org.triumphxx.mqserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.triumphxx.mqserver.sender.Sender;

/**
 * @author:triumphxx
 * @Date:2020/5/1
 * @Time:8:18 上午
 * @desc:测试MQ
 **/
@RestController
public class MqController {

    @Autowired
    private Sender sender;
    @RequestMapping("/mq")
    public String mqSender() {
        sender.send();
        return "发送成功";
    }
}
