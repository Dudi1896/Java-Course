module com.example.javaii__lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaii__lab1 to javafx.fxml;
    exports com.example.javaii__lab1;
}