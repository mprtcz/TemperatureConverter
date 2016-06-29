package com.tem.tempConverter.Controller;

import com.tem.tempConverter.converters.Converter;
import com.tem.tempConverter.converters.ConverterFactory;
import com.tem.tempConverter.utils.Scale;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created by Azet on 2016-06-28.
 */
public class Controller {
    public TextField enteredValueTextField;
    public ChoiceBox<Scale> scaleChoiceBox;
    public Button toCelsiusButton;
    public Button toFahrenheitButton;
    public Button toKelvinButton;
    public TextArea resultsTextArea;


    public void onToCelsiusButtonClicked() {
        convertHelper(Scale.CELSIUS);
    }

    public void onToFahrenheitButtonCLicked() {
        convertHelper(Scale.FAHRENHEIT);
    }

    public void onToKelvinButtonClicked() {
        convertHelper(Scale.KELVIN);
    }

    public void initialize() {
        //populate scaleChoiceBox
        scaleChoiceBox.getItems().addAll(Scale.CELSIUS);
        scaleChoiceBox.getItems().addAll(Scale.FAHRENHEIT);
        scaleChoiceBox.getItems().addAll(Scale.KELVIN);
        scaleChoiceBox.setValue(Scale.CELSIUS);
    }

    private void convertHelper(Scale scaleToConvertTo){
        String enteredValue = enteredValueTextField.getText();
        try {
            int value = Integer.parseInt(enteredValue);

            Converter converter = ConverterFactory.getConverter(scaleToConvertTo);
            double result = converter.convert(scaleChoiceBox.getValue(), value);

            resultsTextArea.setText(value +" degrees " +scaleChoiceBox.getValue().toString().toLowerCase()
                    +" equals " +result +" degrees " +scaleToConvertTo.toString().toLowerCase());

        } catch (NumberFormatException nex) {
            enteredValueTextField.setText("Please type only numeric values");
        }
    }
}
