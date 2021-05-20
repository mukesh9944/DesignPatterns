package com.mukesh.design.pattern.factory;

public class FactoryMethodClass {

    static MiModel getInstance(String model){
        MiModel mobile = null;
        if("MiBolt".equalsIgnoreCase(model)){
            mobile = new MiBolt();
        } else if("MiFire".equalsIgnoreCase(model)){
            mobile = new MiFire();
        }
        return mobile;
    }
}
