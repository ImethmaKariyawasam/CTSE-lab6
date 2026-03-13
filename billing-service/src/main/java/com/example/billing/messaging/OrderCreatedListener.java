package com.example.billing.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @KafkaListener(topics = "order-topic", groupId = "billing-service-group")
    public void handleOrderCreated(String message) {
        System.out.println("[Billing Service] Received event: " + message);
        System.out.println("[Billing Service] Generating invoice for order...");
        // Simulate invoice generation
        System.out.println("[Billing Service] Invoice generated successfully.");
    }
}
