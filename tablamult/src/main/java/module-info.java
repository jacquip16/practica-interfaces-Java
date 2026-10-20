module com.pilli.tablamult {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.tablamult to javafx.fxml;
    exports com.pilli.tablamult;
}
