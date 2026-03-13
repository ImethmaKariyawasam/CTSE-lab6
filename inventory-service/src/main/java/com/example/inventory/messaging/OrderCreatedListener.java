package com.example.inventory.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @KafkaListener(topics = "order-topic", groupId = "inventory-service-group")
    public void handleOrderCreated(String message) {
        System.out.println("[Inventory Service] Received event: " + message);
        System.out.println("[Inventory Service] Updating stock for order...");
        // Simulate stock update
        System.out.println("[Inventory Service] Stock updated successfully.");
    }
}
