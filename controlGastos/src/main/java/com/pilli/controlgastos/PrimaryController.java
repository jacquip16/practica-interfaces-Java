package com.pilli.controlgastos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoMasAlto;

    @FXML
    private void btnCalcular_click() {
        try {
            
            double alimentacion = parseDoubleOrZero(txtAlimentacion.getText());
            double refrigerios = parseDoubleOrZero(txtRefrigerios.getText());
            double transporte = parseDoubleOrZero(txtTransporte.getText());
            double telefonia = parseDoubleOrZero(txtTelefonia.getText());
            double otros = parseDoubleOrZero(txtOtros.getText());

           
            double total = alimentacion + refrigerios + transporte + telefonia + otros;
            txtTotal.setText(String.format("%.0f", total)); 

           
            double[] gastos = {alimentacion, refrigerios, transporte, telefonia, otros};
            String[] nombres = {"Alimentación", "Refrigerios", "Transporte", "Telefonía", "Otros"};

            double maxGasto = gastos[0];
            String categoriaMax = nombres[0];

            for (int i = 1; i < gastos.length; i++) {
                if (gastos[i] > maxGasto) {
                    maxGasto = gastos[i];
                    categoriaMax = nombres[i];
                }
            }

            txtGastoMasAlto.setText(categoriaMax);

        } catch (NumberFormatException e) {
            txtTotal.setText("Error");
            txtGastoMasAlto.setText("Revisar datos");
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        
        txtTotal.setText("");
        txtGastoMasAlto.setText("");
        
        txtAlimentacion.requestFocus();
    }

    
    private double parseDoubleOrZero(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(text.trim());
    }
}