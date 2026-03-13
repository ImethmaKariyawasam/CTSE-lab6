package com.example.orders.controller;

import com.example.orders.model.OrderRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final String TOPIC = "order-topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OrderController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest order) {
        String message = "OrderCreated: " + order.toString();
        kafkaTemplate.send(TOPIC, message);
        System.out.println("[Order Service] Published to Kafka: " + message);
        return "Order Created & Event Published: " + order.getOrderId();
    }

    @GetMapping("/health")
    public String health() {
        return "Order Service is UP";
    }
}
