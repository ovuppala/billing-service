package com.restaurant.billingservice.model;

import lombok.Data;

@Data
public class LineItem {
    String itemName;
    Integer quantity;
    Double subTotal;
}
