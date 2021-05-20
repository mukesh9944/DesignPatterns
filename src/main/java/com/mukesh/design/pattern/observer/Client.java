package com.mukesh.design.pattern.observer;

public class Client {
    public static void main(String[] args) {
        Subject publisher = new Publisher();

        Observer sub1 = new Subscriber1();
        publisher.register(sub1);

        Observer sub2 = new Subscriber2();
        publisher.register(sub2);

        publisher.notifySubs();

        publisher.remove(sub2);

        publisher.notifySubs();
    }
}
