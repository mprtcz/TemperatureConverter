package com.tem.tempconverter.utils;

import com.tem.tempconverter.converters.Converter;
import com.tem.tempconverter.converters.ConverterFactory;
import javafx.scene.chart.XYChart;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azet on 2016-06-30.
 */
public class ChartsDataGenerator {

    private Scale basicScale;
    private int basicValue;
    private int initialValue;
    private int range = 50;


    public ChartsDataGenerator(Scale basicScale, int value) {
        this.basicScale = basicScale;
        this.basicValue = value - range;
        this.initialValue = value;
    }

    public List<XYChart.Series> getChartData(Scale scale) {
        List<XYChart.Series> chartData = new ArrayList<>();
        XYChart.Series series = new XYChart.Series();
        for (double value : generateConvertedScaleArray(scale)) {
            Rectangle rectangle = new Rectangle(0, 0);
            rectangle.setVisible(false);
            XYChart.Data data = new XYChart.Data<>(String.valueOf(basicValue), value);
            data.setNode(rectangle);
            series.getData().add(data);
            basicValue++;
        }

        chartData.add(series);
        return chartData;
    }

    public List<XYChart.Series> getChartInitialValue(Scale scale){
        List<XYChart.Series> chartData = new ArrayList<>();
        XYChart.Series series = new XYChart.Series();
        Converter converter = ConverterFactory.getConverter(scale);
        XYChart.Data data2 = new XYChart.Data<>(String.valueOf(initialValue), converter.convert(basicScale, initialValue));
        series.getData().add(data2);

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
