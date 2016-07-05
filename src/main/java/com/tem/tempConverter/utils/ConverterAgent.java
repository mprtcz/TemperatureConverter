package com.tem.tempconverter.utils;

/**
 * Created by Azet on 2016-06-29.
 */
public class ConverterAgent {
    int value;
    Scale scaleToConvertFrom;
    Scale scaleToConvertTo;

    public ConverterAgent(Scale scaleToConvertFrom, Scale scaleToConvertTo, int value) {
        this.scaleToConvertFrom = scaleToConvertFrom;
        this.scaleToConvertTo = scaleToConvertTo;
        this.value = value;
    }

}
