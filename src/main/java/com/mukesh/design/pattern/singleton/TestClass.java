package com.mukesh.design.pattern.singleton;

public class TestClass {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClass = SingletonClass.createInstance();
                SingletonClass2 singletonClass2 = SingletonClass2.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonClass singletonClass = SingletonClass.createInstance();
                SingletonClass2 singletonClass2 = SingletonClass2.getInstance();
            }
        });

        t1.start();
        t2.start();

    }

}
