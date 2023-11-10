module com.labs.javaii__lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.labs.javaii__lab2 to javafx.fxml;
    exports com.labs.javaii__lab2;
}