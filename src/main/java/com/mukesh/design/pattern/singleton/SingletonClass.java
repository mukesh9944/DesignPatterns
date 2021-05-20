package com.mukesh.design.pattern.singleton;

public class SingletonClass {

    private static SingletonClass singleObject;

    private SingletonClass() {
        System.out.println("private constructor");
    }
    //public static synchronized SingletonClass createInstance() {
    public static SingletonClass createInstance() {

       /* if(singleObject == null) {
            singleObject = new SingletonClass();
        }*/

        if(singleObject == null) {
            synchronized (SingletonClass.class) {
                if(singleObject == null) {
                    singleObject = new SingletonClass();
                    System.out.println("Object created");
                }
            }
        }

        return singleObject;
    }
}
