package com.example.gccoffee2.model;

public enum OrderStatus {
    ACCEPTED,  // 주문을 ACCEPTED 했다
    PAYMENT_CONFIRMED,   // 지불 확인
    READY_FOR_DELIVERY,  // (오후 2시에)배송 준비가 됐다.
    SHIPPED,   // 배송됨
    SETTLED,   // 받음
    CANCELLED  // 취소
}
