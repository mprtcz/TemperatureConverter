package com.tem.tempconverter.utils;

import com.tem.tempconverter.logger.ConvertersLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Azet on 2015-08-02.
 */
public class ArgumentParser {
    private final static Logger logger = Logger.getLogger(ConvertersLogger.class.getName());


    public static Arguments arguments(String[] args) {
        Level level = Level.CONFIG;

        Scale convertTo = null;
        Scale convertFrom = null;
        double value;

        if (args.length != 3) {
            logger.log(level, "Incorrect parameters!");
        }

        switch (args[0]) {
            case "-K":
                convertFrom = Scale.KELVIN;
                break;
            case "-F":
                convertFrom = Scale.FAHRENHEIT;
                break;
            case "-C":
                convertFrom = Scale.CELSIUS;
                break;
        }

        value = Double.valueOf(args[1]);

        switch (args[2]) {
            case "-K":
                convertTo = Scale.KELVIN;
                break;
            case "-F":
                convertTo = Scale.FAHRENHEIT;
                break;
            case "-C":
                convertTo = Scale.CELSIUS;
                break;
        }
        logger.log(level, "convertFrom: " +convertFrom + " value: "  +value +" convertTo " + convertTo);
        return new Arguments(convertFrom, value, convertTo);
    }
}
