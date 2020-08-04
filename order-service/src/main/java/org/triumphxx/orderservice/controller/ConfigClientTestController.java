//package org.triumphxx.orderservice.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.core.env.Environment;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author:triumphxx
// * @Date:2020/4/26
// * @Time:10:50 下午
// * @desc:测试配置中心接口
// **/
//@RestController
//@RefreshScope
//public class ConfigClientTestController {
//
//    @Value("${triumphxx.wang}")
//    String type;
//    @Autowired
//    Environment env;
//
//    @RequestMapping("/test")
//    public String test() {
//        return this.type;
//    }
//    @RequestMapping("/test1")
//    public String test2() {
//        return env.getProperty("triumphxx.yu", "未定义");
//    }
//}
