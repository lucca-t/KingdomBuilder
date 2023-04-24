package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new KingdomBuilderMain();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1424, 801);
        stage.setTitle("KingdomBuilder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}