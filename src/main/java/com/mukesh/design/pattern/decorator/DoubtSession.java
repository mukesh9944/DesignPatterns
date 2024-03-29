package com.mukesh.design.pattern.decorator;

public class DoubtSession extends AbstractDecorator{

    Member m;

    public DoubtSession(Member m) {
        this.m = m;
    }

    @Override
    public double cost() {
        return 500 + m.cost();
    }
}
