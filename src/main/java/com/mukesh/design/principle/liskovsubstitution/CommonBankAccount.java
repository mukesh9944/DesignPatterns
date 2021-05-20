package com.mukesh.design.principle.liskovsubstitution;

public class CommonBankAccount {

    private AccountManager accountManager;

    public CommonBankAccount(){
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

    public  void income(double tax){
        this.accountManager.income(0.02);
    }
}
