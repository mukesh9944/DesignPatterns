package com.mukesh.design.pattern.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractMobileFactory factory = new LondonFactory();
        MiModel mobile = factory.configureMb("MiFire");

        AbstractMobileFactory nyFactory = new NYFactory();
        MiModel mobile2 = nyFactory.configureMb("MiPlus");
    }

}
