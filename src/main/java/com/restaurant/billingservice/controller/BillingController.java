package com.restaurant.billingservice.controller;

import com.restaurant.billingservice.model.Bill;
import com.restaurant.billingservice.service.BillingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class BillingController {

    Logger LOGGER = LoggerFactory.getLogger(BillingController.class);

    @Autowired
    BillingService billingService;

    // generate bill either by table number or customer name
    @GetMapping(value = "generate-bill", produces = "application/json")
    public ResponseEntity<Bill> generateBill(String tableNumber){
        return new ResponseEntity<Bill>(billingService.generateBill(tableNumber), HttpStatus.OK);
    }

}
