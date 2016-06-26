package com.tem.tempConverter.Logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

/**
 * Created by Azet on 2016-06-26.
 */
public class ConvertersLogger {
    private final static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConvertersLogger.class.getName());
    private static Handler handler = null;

    public static void initializeLogger() {
        try {
            handler = new FileHandler("log.log", false);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Could not create file");
            e.printStackTrace();
        }
        java.util.logging.Logger newLogger = java.util.logging.Logger.getLogger("");
        handler.setFormatter(new SimpleFormatter());
        newLogger.addHandler(handler);
        newLogger.setLevel(Level.CONFIG);
    }
}
