package com.pilli.cifras;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    
    @FXML private TextField txtCantCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    
    @FXML private TextArea txtDivisores;

    @FXML
    private void btnAnalizar_click() {
        try {
            int num = Integer.parseInt(txtNumero.getText());
            num = Math.abs(num); 
            String numStr = String.valueOf(num);
            int cantCifras = numStr.length();
            
            int sumaImpares = 0;
            int sumaPares = 0;
            int sumaTotal = 0;
            int cifraMayor = 0;
            int cifraMenor = 9;

            for (int i = 0; i < numStr.length(); i++) {
                int digito = Character.getNumericValue(numStr.charAt(i));
                
             
                sumaTotal += digito;
                
                
                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }
                
                
                if (digito > cifraMayor) {
                    cifraMayor = digito;
                }
                if (digito < cifraMenor) {
                    cifraMenor = digito;
                }
            }

            txtCantCifras.setText("" + cantCifras);
            txtSumaImpares.setText("" + sumaImpares);
            txtSumaPares.setText("" + sumaPares);
            txtSumaTotal.setText("" + sumaTotal);
            txtCifraMayor.setText("" + cifraMayor);
            txtCifraMenor.setText("" + cifraMenor);

            StringBuilder divisoresStr = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisoresStr.append(i).append("\n");
                }
            }
            
            txtDivisores.setText(divisoresStr.toString());

        } catch (NumberFormatException e) {
            btnLimpiar_click();
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.setText("");
        txtCantCifras.setText("");
        txtSumaImpares.setText("");
        txtSumaPares.setText("");
        txtSumaTotal.setText("");
        txtCifraMayor.setText("");
        txtCifraMenor.setText("");
        txtDivisores.setText("");
        txtNumero.requestFocus();
    }
}