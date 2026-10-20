module com.pilli.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.edad to javafx.fxml;
    exports com.pilli.edad;
}
