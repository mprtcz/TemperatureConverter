package com.tem.omg.converters;

import com.tem.omg.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public class ToKelvin implements Converter{

    @Override

    public double convert(Scale convertFrom, double wynik){
        //wynik = Double.valueOf(value);

        if(convertFrom == Scale.CELSIUS){
            wynik = wynik + 273.15;

        } else if(convertFrom == Scale.FAHRENHEIT){
            wynik = (wynik + 459.67) * 0.555;

        } else if(convertFrom == Scale.KELVIN){}
        else{
            System.out.println("Errrororr");
        }

        return wynik;
    }
}
