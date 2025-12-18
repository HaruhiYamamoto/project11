package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    private Button helloButton;

    @FXML
    private void initialize() {
        helloButton.setOnAction(event -> sayHello());
    }
    
    private void sayHello() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greeting");
        alert.setHeaderText(null);
        alert.setContentText("Hello, World!");
        alert.showAndWait();
    }
}
