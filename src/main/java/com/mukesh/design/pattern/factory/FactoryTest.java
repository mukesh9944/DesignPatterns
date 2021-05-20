package com.mukesh.design.pattern.factory;

public class FactoryTest {

    public MiModel produceMobile(String model){
        MiModel mobile = null;

        mobile = FactoryMethodClass.getInstance(model);
        mobile.CPU();
        mobile.RAM();
        mobile.Price();

        return mobile;
    }
}
