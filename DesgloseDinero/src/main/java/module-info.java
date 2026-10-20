module com.pilli.desglosedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.desglosedinero to javafx.fxml;
    exports com.pilli.desglosedinero;
}
