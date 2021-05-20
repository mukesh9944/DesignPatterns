package com.mukesh.design.pattern.strategy;

public class Paypal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "Paid using paypal");
    }
}
