package com.tem.tempConverter.converters;

import com.tem.tempConverter.Logger.ConvertersLogger;
import com.tem.tempConverter.utils.Scale;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Azet on 2015-08-02.
 */
public class ToKelvin implements Converter{
    private final static Logger logger = Logger.getLogger(ConvertersLogger.class.getName());
    private Level level = Level.CONFIG;

    @Override
    public double convert(Scale convertFrom, double result){
        if(convertFrom == Scale.CELSIUS){
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return result + 273.15;

        } else if(convertFrom == Scale.FAHRENHEIT){
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return (result + 459.67) * 0.555;

        } else if(convertFrom == Scale.KELVIN){
            logger.log(level, "Converting " +result +" from " +convertFrom);
            return result;

        }
        else{
            logger.log(level, "Scale not supported: " +convertFrom);
            return 0;
        }
    }
}
