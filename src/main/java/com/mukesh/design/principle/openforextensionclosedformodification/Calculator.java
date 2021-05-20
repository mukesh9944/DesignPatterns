package com.mukesh.design.principle.openforextensionclosedformodification;

public class Calculator {

    public void calculate(CalculatorOperation operation){
        operation.perform();
    }
}
