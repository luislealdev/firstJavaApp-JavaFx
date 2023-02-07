package com.example.firstdesktopappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Declare elements
        StackPane root = new StackPane();

        Text title = new Text();

        VBox vBox = new VBox(5);


        HBox hBox = new HBox(5);
        TextField firstName = new TextField();
        TextField lastName = new TextField();
        Button btn = new Button();

        //SETS
        title.setText("Say hi in JAVA");
        //Add button's text
        btn.setText("Say hi");
        //Set align to center on Vbox
        vBox.setAlignment(Pos.CENTER);

        //CSS STYLES
        hBox.setStyle("-fx-padding: 15px");
        vBox.setStyle("-fx-padding: 15px");


        //Add Elements to Boxes
        hBox.getChildren().addAll(firstName, lastName);
        vBox.getChildren().addAll(title,hBox, btn);


        //Add action to button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = firstName.getText() +" "+ lastName.getText();
                showMessage("Hello " + name);
            }
        });


        root.getChildren().add(vBox);

        //SCENE
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