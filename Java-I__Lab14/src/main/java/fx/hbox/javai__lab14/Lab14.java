package fx.hbox.javai__lab14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class Lab14 extends Application {



    @Override
    public void start(Stage primaryStage) {
        // Create an HBox
        HBox hBoxObj = new HBox();
        hBoxObj.setPadding(new Insets(10));
        hBoxObj.setSpacing(10);

        // Create a Font object with the given specifications
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 22);

        // Create five Text objects with the given specifications
        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java I");
            text.setFill(getRandomColor());
            text.setFont(font);
            text.setRotate(60);
            hBoxObj.getChildren().add(text);
        }

        // Set the scene size and title
        Scene scene = new Scene(hBoxObj, 300, 100);
        primaryStage.setTitle("Lab 14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to generate a random color
    private Color getRandomColor() {
        double r = Math.random();
        double g = Math.random();
        double b = Math.random();
        return new Color(r, g, b, 1.0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
