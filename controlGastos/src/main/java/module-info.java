module com.pilli.controlgastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pilli.controlgastos to javafx.fxml;
    exports com.pilli.controlgastos;
}
