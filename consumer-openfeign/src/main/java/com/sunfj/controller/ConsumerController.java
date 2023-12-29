package com.sunfj.controller;

import com.sunfj.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    public ConsumerService getConsumerService() {
        return consumerService;
    }

    public void setConsumerService(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @RequestMapping("/add")
    public String add(){
        return consumerService.addOrder();
    }
}
