package com.mukesh.design.pattern.decorator;

public class JobAssistance extends AbstractDecorator{

    Member m;

    public JobAssistance(Member m) {
        this.m = m;
    }

        @Override
        public double cost() {
        return 900 + m.cost();
    }

}
