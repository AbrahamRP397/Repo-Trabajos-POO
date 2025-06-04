package com.abraham.holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label myLabel = new Label("Mi etiqueta");
        StackPane root = new StackPane(myLabel);
        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("Mi primer programa en JavaFX");
        Image myImage = new Image(getClass().getResourceAsStream("/img/factura.png"));
        stage.getIcons().add(myImage);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}