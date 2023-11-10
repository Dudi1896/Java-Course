module org.dbtester.javaii__lab10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires ucanaccess;

    opens org.dbtester.javaii__lab10 to javafx.fxml;
    exports org.dbtester.javaii__lab10;
}