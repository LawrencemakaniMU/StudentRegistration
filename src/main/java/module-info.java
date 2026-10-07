module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports studentregistration;

    // FXMLLoader needs reflective access to the controllers (@FXML fields and methods)
    opens studentregistration to javafx.fxml;
    opens customermanager to javafx.fxml;
}
