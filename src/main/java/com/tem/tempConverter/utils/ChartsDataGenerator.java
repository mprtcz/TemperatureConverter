package com.tem.tempConverter.utils;

import com.tem.tempConverter.converters.Converter;
import com.tem.tempConverter.converters.ConverterFactory;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azet on 2016-06-30.
 */
public class ChartsDataGenerator {

    Scale basicScale;
    int basicValue;
    int range = 50;


    public ChartsDataGenerator(Scale basicScale, int value) {
        this.basicScale = basicScale;
        this.basicValue = value - range;
    }

    public List<XYChart.Series> getChartData(Scale scale) {
        List<XYChart.Series> chartData = new ArrayList<>();
        XYChart.Series series = new XYChart.Series();
        series.setName(scale.toString() +" / " +basicScale.toString());
        for (double value : generateConvertedScaleArray(scale)) {
            series.getData().add(new XYChart.Data<>(String.valueOf(basicValue), value));
            basicValue++;
        }
        chartData.add(series);
        return chartData;
    }

    private double[] generateConvertedScaleArray(Scale scale) {
        double[] array = new double[range*2];
        int index = 0;
        Converter converter = ConverterFactory.getConverter(scale);
        for (int i = basicValue; i < basicValue + range*2; i++) {
            array[index] = converter.convert(basicScale, i);
            index++;
        }
        return array;
    }
}
