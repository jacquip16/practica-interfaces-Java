module com.pilli.cifras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.cifras to javafx.fxml;
    exports com.pilli.cifras;
}
