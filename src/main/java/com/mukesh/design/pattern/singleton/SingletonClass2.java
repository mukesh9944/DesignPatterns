package com.mukesh.design.pattern.singleton;

public class SingletonClass2 {

    private static SingletonClass2 singleObject = new SingletonClass2();

    private SingletonClass2() {
        System.out.println("private constructor");
    }


    public static SingletonClass2 getInstance() {
        return singleObject;
    }
}
