package com.labs.javaii__lab2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Optional;

public class StudentInformationApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Information");

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Top Part
        Label titleLabel = new Label("Student Information");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        root.setTop(titleLabel);

        // Middle Part (Form)
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label idLabel = new Label("ID:");
        TextField idTextField = new TextField();

        Label firstNameLabel = new Label("First Name:");
        TextField firstNameTextField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameTextField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();

        Label gpaLabel = new Label("GPA:");
        TextField gpaTextField = new TextField();

        grid.add(idLabel, 0, 0);
        grid.add(idTextField, 1, 0);
        grid.add(firstNameLabel, 0, 1);
        grid.add(firstNameTextField, 1, 1);
        grid.add(lastNameLabel, 0, 2);
        grid.add(lastNameTextField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailTextField, 1, 3);
        grid.add(gpaLabel, 0, 4);
        grid.add(gpaTextField, 1, 4);

        root.setCenter(grid);

        // Bottom Part (Buttons)
        HBox buttonBox = new HBox(10);
        buttonBox.setPadding(new Insets(10, 0, 0, 0));

        Button findButton = new Button("Find");
        Button insertButton = new Button("Insert");
        Button deleteButton = new Button("Delete");
        Button updateButton = new Button("Update");
        Button exitButton = new Button("Exit");

        buttonBox.getChildren().addAll(findButton, insertButton, deleteButton, updateButton, exitButton);
        root.setBottom(buttonBox);

        // Handling the Exit button
        exitButton.setOnAction(event -> {
            boolean exitConfirmed = showExitConfirmationDialog();
            if (exitConfirmed) {
                primaryStage.close();
            }
        });

        // Handling the "X" button at the top right of the window
        primaryStage.setOnCloseRequest(event -> {
            boolean exitConfirmed = showExitConfirmationDialog();
            if (!exitConfirmed) {
                event.consume();
            }
        });

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean showExitConfirmationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");
        ButtonType yesButton = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(yesButton, noButton);

        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == yesButton;
    }
}
