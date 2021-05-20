package com.mukesh.design.principle.dependencyinersion;

public class FrontEndDeveloper implements IDeveloper {
    @Override
    public void develop() {
        writeJavaScript();
    }

    private void writeJavaScript(){
        System.out.println("Java script");
    }

    /*public void writeJavaScript(){
        System.out.println("Java script");
    }*/
}
