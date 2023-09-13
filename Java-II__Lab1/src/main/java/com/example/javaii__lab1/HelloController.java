package com.example.javaii__lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onOpenButtonClick() {
        welcomeText.setText("Open Application!");
    }
    @FXML
    protected void onCloseButtonClick() {
        welcomeText.setText("Close Application!");
    }
    @FXML
    protected void onExitButtonClick() {
        welcomeText.setText("Exit Application!");
    }
}