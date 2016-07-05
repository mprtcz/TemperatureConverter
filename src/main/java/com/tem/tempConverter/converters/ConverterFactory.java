package com.tem.tempconverter.converters;

import com.tem.tempconverter.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public class ConverterFactory {

    public static Converter getConverter(Scale arguments) {
        Converter temperature = null;

        if (arguments == Scale.CELSIUS) {
            temperature = new ToCelsius();
        } else if (arguments == Scale.FAHRENHEIT) {
            temperature = new ToFahrenheit();
        } else if (arguments == Scale.KELVIN) {
            temperature = new ToKelvin();
        }
        return temperature;
    }
}
