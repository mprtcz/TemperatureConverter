package com.tem.tempConverter;

import com.tem.tempConverter.Logger.ConvertersLogger;
import com.tem.tempConverter.converters.Converter;
import com.tem.tempConverter.converters.ConverterFactory;
import com.tem.tempConverter.utils.ArgumentParser;
import com.tem.tempConverter.utils.Arguments;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Azet on 2015-08-02.
 */
public class App {
    private final static Logger logger = Logger.getLogger(ConvertersLogger.class.getName());
    private Level level = Level.CONFIG;


    public static void main(String[] args) {
        ConvertersLogger.initializeLogger();

        Arguments arguments = ArgumentParser.arguments(args);

        Converter converter = ConverterFactory.getConverter(arguments.getConvertTo());
        double result = converter.convert(arguments.getConvertFrom(), arguments.getValue());
        System.out.println("Converting from " + arguments.getValue() + " "
                + arguments.getConvertFrom() + " to " + arguments.getConvertTo() + ". Result: " + result);

    }
}
