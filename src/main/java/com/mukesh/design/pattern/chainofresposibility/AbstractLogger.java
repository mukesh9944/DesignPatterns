package com.mukesh.design.pattern.chainofresposibility;

import com.mukesh.design.pattern.builder.AnnualService;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    abstract protected void write(String message);

    protected abstract void logMessage(int level, String message);

    protected abstract void setNextLogger(AbstractLogger nextLogger);
}
