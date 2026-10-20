package com.pilli.edad;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtAnio;
    @FXML private Label lblResultado;
    
    @FXML
    private void btnCalcular_click() {
        try {
            int anioNacimiento = Integer.parseInt(txtAnio.getText());
            int anioActual = LocalDate.now().getYear(); 
            
            if (anioNacimiento > anioActual || anioNacimiento < 1900) {
                lblResultado.setText("Por favor, ingrese un año válido.");
                return;
            }
            
            int edad = anioActual - anioNacimiento;
            lblResultado.setText("Tiene " + edad + " años");
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingrese un número válido para el año.");
        }
    }
    
    @FXML
    private void btnLimpiar_click() {
        txtAnio.setText("");
        lblResultado.setText("");
        txtAnio.requestFocus();
    }
}