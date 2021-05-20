package com.mukesh.design.pattern.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();

        Assembly assembly = builder.assembleMb("Premium");
        assembly.showCost();

        Assembly assembly1 = builder.assembleMb("Gold");
        assembly1.showCost();
    }
}
