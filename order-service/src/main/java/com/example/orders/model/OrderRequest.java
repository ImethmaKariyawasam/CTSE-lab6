package com.example.orders.model;

public class OrderRequest {
    private String orderId;
    private String item;
    private int quantity;

    public OrderRequest() {}

    public OrderRequest(String orderId, String item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "OrderRequest{orderId='" + orderId + "', item='" + item + "', quantity=" + quantity + "}";
    }
}
