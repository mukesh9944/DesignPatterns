package com.mukesh.design.pattern.observer;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifySubs();
}
