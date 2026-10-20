package com.pilli.desglosedinero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtDinero;

    @FXML private Label lbl500;
    @FXML private Label lbl200;
    @FXML private Label lbl100;
    @FXML private Label lbl50;
    @FXML private Label lbl20;
    @FXML private Label lbl10;
    @FXML private Label lbl5;
    @FXML private Label lbl2;
    @FXML private Label lbl1;

    @FXML
    private void btnDesglosar_click() {
        try {
            int monto = Integer.parseInt(txtDinero.getText());

            if (monto < 0) {
                limpiarResultados();
                return;
            }

           
            int b500 = monto / 500;
            monto %= 500;

            int b200 = monto / 200;
            monto %= 200;

            int b100 = monto / 100;
            monto %= 100;

            int b50 = monto / 50;
            monto %= 50;

            int b20 = monto / 20;
            monto %= 20;

            int m10 = monto / 10;
            monto %= 10;

            int m5 = monto / 5;
            monto %= 5;

            int m2 = monto / 2;
            monto %= 2;

            int m1 = monto;
            lbl500.setText("" + b500);
            lbl200.setText("" + b200);
            lbl100.setText("" + b100);
            lbl50.setText("" + b50);
            lbl20.setText("" + b20);
            lbl10.setText("" + m10);
            lbl5.setText("" + m5);
            lbl2.setText("" + m2);
            lbl1.setText("" + m1);

        } catch (NumberFormatException e) {
            limpiarResultados();
        }
    }

    @FXML
    private void btnBorrar_click() {
        txtDinero.setText("");
        limpiarResultados();
        txtDinero.requestFocus();
    }

    private void limpiarResultados() {
        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
    }
}