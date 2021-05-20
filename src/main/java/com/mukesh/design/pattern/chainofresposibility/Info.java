package com.mukesh.design.pattern.chainofresposibility;

public class Info extends AbstractLogger {
    int level;
    public Info(int level) {
        this.level = level;
    }

    protected AbstractLogger nextLogger;

    @Override
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    @Override
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO :"+message);
    }
}
