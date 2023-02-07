package com.example.firstdesktopappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
        //Declare button
        Button btn = new Button();
        //Add action to button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showMessage("Hello World");
            }
        });
        //Add button's text
        btn.setText("Say hi");

        root.getChildren().add(btn);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("First Desktop App - Luis Leal!");
        stage.setScene(scene);
        stage.show();
    }

    //Show Alert Method
    private void showMessage(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setContentText(message);
        alert.show();
    }

    //MAIN
    public static void main(String[] args) {
        launch();
    }
}