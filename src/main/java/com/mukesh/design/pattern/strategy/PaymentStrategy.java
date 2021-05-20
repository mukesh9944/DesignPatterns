package com.mukesh.design.pattern.strategy;

public class PaymentStrategy {

    public void pay(Payment method){
        method.pay(100);
    }
}
