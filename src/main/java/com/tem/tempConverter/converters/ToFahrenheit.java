package com.tem.tempconverter.converters;

import com.tem.tempconverter.logger.ConvertersLogger;
import com.tem.tempconverter.utils.Scale;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Azet on 2015-08-02.
 */
public class ToFahrenheit implements Converter {
    private final static Logger logger = Logger.getLogger(ConvertersLogger.class.getName());
    private Level level = Level.CONFIG;

    @Override
    public double convert(Scale convertFrom, double result) {
        if (convertFrom == Scale.KELVIN) {
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return result * 1.8 - 459.67;

        } else if (convertFrom == Scale.CELSIUS) {
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return result * 1.8 + 32;

        } else if (convertFrom == Scale.FAHRENHEIT) {
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return result;

        } else {
            logger.log(level, "Scale not supported: " +convertFrom);
            return 0;
        }
    }
}
