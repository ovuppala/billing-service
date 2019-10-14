package com.restaurant.billingservice.repository;

import com.restaurant.billingservice.model.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends MongoRepository<Bill, String> {

    public Bill findBillByTableNumber(String tableNumber);
}
