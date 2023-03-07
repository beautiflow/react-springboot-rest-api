package com.example.gccoffee2.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID orderId;  // Order도 마찬가지로 orderId가 필요함. orderId 엔티티는 식별자가 존재해야 함.
    private final Email email;  // 이메일 필요. 꼭 이메일 형태로 주문을 받아야 함. 잘못된 문자열을 받았을때 주문을 받지 않아야 함
    private String address;  // 주문을 할 배송에 대해 간단하게 정의할 수 있다.
    private String postcode;  // 주문지 등록에 관한 내용
    private final List<OrderItem> orderItems;  // 상세 주문 아이템들을 리스트로 받아야 함.
    private OrderStatus orderStatus;  // 주문도 상태가 있다.
    private final LocalDateTime createdAt;  // 주문이 만들어진 시간
    private LocalDateTime updatedAt;  // 주문상태도 변경될 수 있음.

    public Order(UUID orderId, Email email, String address, String postcode, List<OrderItem> orderItems, OrderStatus orderStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.orderId = orderId;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.orderItems = orderItems;
        this.orderStatus = orderStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public Email getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setAddress(String address) {
        this.address = address;
        this.updatedAt = LocalDateTime.now();
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
        this.updatedAt = LocalDateTime.now();
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        this.updatedAt = LocalDateTime.now();  // 실제 상태를 바꾸거나 변경이 있을때마다 업데이트로 변경해줌
    }
}
