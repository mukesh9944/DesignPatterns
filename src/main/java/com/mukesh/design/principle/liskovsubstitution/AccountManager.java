package com.mukesh.design.principle.liskovsubstitution;

public class AccountManager {

    private double balance;

    public void deposit(double value){
        this.balance += value;
    }

    public double cashOut(double value) {
        this.balance -= value;
        return value;
    }

    public double getBalance(){
        return this.balance;
    }

    public  void income(double tax){
        this.balance = this.balance + (this.balance * tax);
    }
}
