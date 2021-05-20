package com.mukesh.design.pattern.abstractfactory;

public abstract class AbstractMobileFactory {

    public abstract MiModel produceMobile(String model);

    public MiModel configureMb(String model){
        MiModel mobile = produceMobile(model);
        mobile.CPU();
        mobile.RAM();
        mobile.Price();
        return mobile;
    }
}
