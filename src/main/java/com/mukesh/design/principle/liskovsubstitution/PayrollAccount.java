package com.mukesh.design.principle.liskovsubstitution;

public class PayrollAccount {

    private AccountManager accountManager;

    public PayrollAccount(){
        this.accountManager = new AccountManager();
    }

    public void deposit(double value){
        this.accountManager.deposit(value);
    }

    public void cashOut(double value) {
        this.accountManager.cashOut(value);
    }

    public double getBalance(){
        return this.accountManager.getBalance();
    }
}
