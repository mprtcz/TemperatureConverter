package com.tem.omg.utils;

/**
 * Created by Azet on 2015-08-02.
 */
public class ArgumentParser {

    public static Arguments arguments(String[] args){
        Scale convertTo = null;
        Scale convertFrom = null;
        double value = 0.0;
        //-K kelvin, -C celsius, -F fahrenheit

        if(args.length!=3){
            System.out.println("Nieprawid³owe parametry");
        }

        if(args[0].equals("-K")){
            convertFrom = Scale.KELVIN;
        } else if (args[0].equals("-F")){
            convertFrom = Scale.FAHRENHEIT;
        } else if (args[0].equals("-C")){
            convertFrom = Scale.CELSIUS;
        }

        value = Double.valueOf(args[1]);

        if(args[2].equals("-K")){
            convertTo = Scale.KELVIN;
        } else if (args[2].equals("-F")){
            convertTo = Scale.FAHRENHEIT;
        } else if (args[2].equals("-C")){
            convertTo = Scale.CELSIUS;
        }

        return new Arguments(convertFrom,value,convertTo);
    }
}
