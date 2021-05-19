package com.mukesh.design.pattern.decorator;

public class DecoratorDesignPattern {

    public static void main(String[] args) {

        Member lfs = new LifetimeSubscription();

        System.out.println(lfs.cost());

        Member assis = new Assignments(lfs);

        System.out.println(assis.cost());

        Member ja = new JobAssistance(assis);

        System.out.println(ja.cost());
    }



}
