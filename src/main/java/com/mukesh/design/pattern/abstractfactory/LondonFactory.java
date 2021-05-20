package com.mukesh.design.pattern.abstractfactory;

public class LondonFactory extends AbstractMobileFactory{
    @Override
    public MiModel produceMobile(String model) {

        MiModel mobile = null;

        if ("MiBolt".equalsIgnoreCase(model)) {
            mobile = new MiBolt();
        } else if ("MiFire".equalsIgnoreCase(model)) {
            mobile = new MiFire();
        }
        return mobile;

    }
}
