package com.sunfj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/addOrder")
    public String addOrder(){
        return "库存下单成功"+port;
    }
}
