package com.tem.tempconverter;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Azet on 2015-08-02.
 */
public class App extends javafx.application.Application {
    @Override
    public void start(Stage window) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainMenu.fxml"));
        System.out.println(getClass().getResource("/"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 800, 600);

        window.setTitle("Temperature Converter");
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
