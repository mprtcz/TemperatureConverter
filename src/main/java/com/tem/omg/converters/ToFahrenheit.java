package com.tem.omg.converters;

import com.tem.omg.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public class ToFahrenheit implements Converter{

    @Override

    public double convert(Scale convertFrom, double wynik){
        //wynik = Double.valueOf(value);

        if(convertFrom == Scale.KELVIN){
            wynik = wynik * 1.8 - 459.67;

        } else if(convertFrom == Scale.CELSIUS){
            wynik = wynik * 1.8 + 32;

        } else if(convertFrom == Scale.FAHRENHEIT){}
        else{
            System.out.println("Erorororor");
        }

        return wynik;
    }
}
