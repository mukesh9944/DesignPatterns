package com.mukesh.design.pattern.strategy;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "Paid using credit card");
    }
}
