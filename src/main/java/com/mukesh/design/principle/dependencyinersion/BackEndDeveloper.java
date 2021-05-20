package com.mukesh.design.principle.dependencyinersion;

public class BackEndDeveloper implements IDeveloper{
    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava(){
        System.out.println("Java");
    }

    /*public void writeJava(){
        System.out.println("Java");
    }*/

}
