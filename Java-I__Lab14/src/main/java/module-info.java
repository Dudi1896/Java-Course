module fx.hbox.javai__lab14 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens fx.hbox.javai__lab14 to javafx.fxml;
    exports fx.hbox.javai__lab14;
}