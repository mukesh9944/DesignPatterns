package com.mukesh.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        System.out.println("Adding");
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        System.out.println("Removing");
        observers.remove(observer);
    }

    @Override
    public void notifySubs() {
        for (Observer observer:observers
             ) {
            observer.update("New Video");
        }
    }
}
