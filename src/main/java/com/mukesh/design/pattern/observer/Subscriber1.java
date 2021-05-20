package com.mukesh.design.pattern.observer;

public class Subscriber1 implements Observer{
    @Override
    public void update(String newVideo) {
        System.out.println("new video from publisher");
    }
}
