package com.mukesh.design.principle.dependencyinersion;

import java.util.List;

public class Project {

    private List<IDeveloper> developers;

    public Project(List<IDeveloper> developers){
        this.developers = developers;
    }

    public void implement() {
        for (IDeveloper developer:
             developers) {
            developer.develop();
        }
    }
    /*BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement(){
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavaScript();
    }*/
}
