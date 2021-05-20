package com.mukesh.design.pattern.strategy;

public class Client {

    public static void main(String[] args) {
        PaymentStrategy ps = new PaymentStrategy();

        ps.pay(new Paypal());
    }
}
