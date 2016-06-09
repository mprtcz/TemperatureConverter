package com.tem.omg;

import com.tem.omg.converters.*;
import com.tem.omg.utils.ArgumentParser;
import com.tem.omg.utils.Arguments;
import com.tem.omg.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public class App {
    public static void main(String[] args){
        Arguments arguments = ArgumentParser.arguments(args);

        Converter converter = ConverterFactory.getConverter(arguments.getConvertTo());
        double result = converter.convert(arguments.getConvertFrom(), arguments.getValue());
        System.out.println("Converting from " +arguments.getValue() +" "
                +arguments.getConvertFrom() +" to " +arguments.getConvertTo() +". Result: " +result);

    }
}
