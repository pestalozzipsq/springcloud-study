package com.sunfj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stock-service")
public interface ConsumerService {
    @RequestMapping("/stock/addOrder")
    String addOrder();
}
