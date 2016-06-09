package com.tem.omg.converters;

import com.tem.omg.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public class ToCelsius implements Converter{

    @Override

    public double convert(Scale convertFrom, double wynik){
        //wynik = Double.valueOf(value);

        if(convertFrom == Scale.KELVIN){
            wynik =- 273.15;

        } else if(convertFrom == Scale.FAHRENHEIT){
            wynik = (wynik - 32) / 1.8;

        } else if(convertFrom == Scale.CELSIUS){}

        else {
            System.out.println("ERRRRORRRRR");
        }

        return wynik;
    }
}
