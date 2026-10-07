module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports studentregistration;
    opens studentregistration to javafx.fxml;
    opens customermanager to javafx.fxml;
}
