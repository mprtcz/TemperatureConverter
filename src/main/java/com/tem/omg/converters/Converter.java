package com.tem.omg.converters;

import com.tem.omg.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public interface Converter {
    double convert(Scale convertFrom, double value);
}
