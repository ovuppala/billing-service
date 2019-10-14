package com.restaurant.billingservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("bills")
public class Bill {
    @Id
    String id;
    String tableNumber;
    String customerFirstName;
    List<LineItem> lineItems;
    Double total;
}
