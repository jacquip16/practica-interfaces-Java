package com.pilli.tablamult;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultado;

    @FXML
    private void btnCalcular_click() {
        try {
            int num = Integer.parseInt(txtNumero.getText());
            StringBuilder tabla = new StringBuilder();

           
            for (int i = 1; i <= 10; i++) {
                int producto = num * i;
                tabla.append(num).append(" x ").append(i).append(" = ").append(producto).append("\n");
            }

            txtResultado.setText(tabla.toString());

        } catch (NumberFormatException e) {
            txtResultado.setText("Por favor, ingrese un número entero válido.");
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.setText("");
        txtResultado.setText("");
        txtNumero.requestFocus();
    }
}