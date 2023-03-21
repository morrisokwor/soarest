package com.example.restsoa.controllers;

import com.example.restsoa.models.ApiResponse;
import com.example.restsoa.models.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Morris.Okworo on 20/03/2023
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody Order order) {

        order.setAmount(new BigDecimal(200));
        order.setOrderReceivedTime(LocalDateTime.now());

        return ResponseEntity.ok(new ApiResponse(200, order));
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Long id) {

        Order order = new Order();
        order.setOrderReceivedTime(LocalDateTime.now().minusMinutes(5));
        order.setLatitude("0.000001");
        order.setLongitude("-3.11");
        order.setMilk("Skim");
        order.setAmount(new BigDecimal(200));
        order.setSize("small");
        order.setTimeToWait("2 Minutes");
        order.setProductName("Latte");

        return ResponseEntity.ok(new ApiResponse(200, order));

    }
}
