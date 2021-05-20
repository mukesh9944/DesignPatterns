package com.mukesh.design.pattern.chainofresposibility;

public class Client {

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO, "This is error message");
    }

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger error = new Error(AbstractLogger.ERROR);
        AbstractLogger debug = new Debug(AbstractLogger.DEBUG);
        AbstractLogger info = new Info(AbstractLogger.INFO);

        error.setNextLogger(debug);
        debug.setNextLogger(info);

        return error;
    }
}
