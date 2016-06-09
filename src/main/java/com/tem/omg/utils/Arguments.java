package com.tem.omg.utils;

/**
 * Created by Azet on 2015-08-02.
 */
public class Arguments {
    private Scale convertTo = null;
    private Scale convertFrom = null;
    private double value = 0.0;

    public Arguments(Scale convertFrom, double value, Scale convertTo) {
        this.convertTo = convertTo;
        this.convertFrom = convertFrom;
        this.value = value;
    }

    public Scale getConvertTo() {
        return convertTo;
    }

    public Scale getConvertFrom() {
        return convertFrom;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Arguments{" +
                "convertTo='" + convertTo + '\'' +
                ", convertFrom='" + convertFrom + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
