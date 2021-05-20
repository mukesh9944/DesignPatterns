package com.mukesh.design.pattern.abstractfactory;

public class NYFactory extends AbstractMobileFactory{

    @Override
    public MiModel produceMobile(String model) {

        MiModel mobile = null;

        if ("MiPlus".equalsIgnoreCase(model)) {
            mobile = new MiPlus();
        } else if ("MiFire".equalsIgnoreCase(model)) {
            mobile = new MiFire();
        }
        return mobile;

    }
}
