package com.tem.tempconverter.controller;

import com.tem.tempconverter.converters.*;
import com.tem.tempconverter.utils.ChartsDataGenerator;
import com.tem.tempconverter.utils.Scale;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by Azet on 2016-06-28.
 */
public class Controller {
    public TextField enteredValueTextField;
    public ChoiceBox<Scale> scaleChoiceBox;
    public Label resultsLabel;
    public ChoiceBox<Scale> convertToChoiceBox;
    public Button convertButton;
    public LineChart lineChart;
    public Label convertFromLabel, convertToLabel;


    public void onConvertButtonClicked(){
        String enteredValue = enteredValueTextField.getText();
        try {
            int value = Integer.parseInt(enteredValue);

            Converter converter = ConverterFactory.getConverter(convertToChoiceBox.getValue());
            double result = converter.convert(scaleChoiceBox.getValue(), value);

            resultsLabel.setText(value +" degrees " +scaleChoiceBox.getValue().toString().toLowerCase()
                    +" equals " +result +" degrees " +convertToChoiceBox.getValue().toString().toLowerCase());
            ChartsDataGenerator chartsDataGenerator = new ChartsDataGenerator(scaleChoiceBox.getValue(), value);

            lineChart.getData().clear();
            lineChart.getData().addAll(chartsDataGenerator.getChartData(convertToChoiceBox.getValue()));
            lineChart.getData().addAll(chartsDataGenerator.getChartInitialValue(convertToChoiceBox.getValue()));

            convertFromLabel.setText(scaleChoiceBox.getValue().toString());
            convertToLabel.setText(convertToChoiceBox.getValue().toString());

        } catch (NumberFormatException nex) {
            enteredValueTextField.setText("Please type only numeric values");
        }
    }



    public void initialize() {
        //populate scaleChoiceBox
        for(Scale scale : Scale.values()){
            scaleChoiceBox.getItems().addAll(scale);
            convertToChoiceBox.getItems().addAll(scale);
        }
        scaleChoiceBox.setValue(Scale.CELSIUS);
        convertToChoiceBox.setValue(Scale.CELSIUS);
    }

}
