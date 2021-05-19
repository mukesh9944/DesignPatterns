package com.mukesh.design.pattern.decorator;

public class Assignments extends AbstractDecorator{

    Member m;

    public Assignments(Member m) {
        this.m = m;
    }

    @Override
    public double cost() {
        return 300 + m.cost();
    }
}
