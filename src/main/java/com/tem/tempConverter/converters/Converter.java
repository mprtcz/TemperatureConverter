package com.tem.tempConverter.converters;

import com.tem.tempConverter.utils.Scale;

/**
 * Created by Azet on 2015-08-02.
 */
public interface Converter {
    double convert(Scale convertFrom, double value);
}
