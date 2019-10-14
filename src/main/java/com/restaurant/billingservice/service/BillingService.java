package com.restaurant.billingservice.service;

import com.restaurant.billingservice.model.Bill;
import com.restaurant.billingservice.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    BillingRepository billRepo;

    public Bill generateBill(String tableNumber){
        return billRepo.findBillByTableNumber(tableNumber);
    }
}
