package sumaDeDosNumeros.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sumaDeDosNumeros.model.Suma;

import java.net.URL;
import java.util.ResourceBundle;

public class SumaController implements Initializable {

    @FXML
    private Button btSumar;

    @FXML
    private TextField txtOp1;

    @FXML
    private TextField txtOp2;

    @FXML
    private TextField txtResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Inicialización del controlador.");
        btSumar.setOnAction(this::sumar);
    }

    private void sumar(ActionEvent actionEvent) {
        try {
            int op1 = Integer.parseInt(txtOp1.getText());
            int op2 = Integer.parseInt(txtOp2.getText());
            Suma suma = new Suma(op1,op2);
            txtResultado.setText(String.valueOf(suma.sumar()));
        }catch (NumberFormatException nfe){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Deben de ser números enteros.");
            alert.showAndWait();
        }

    }
}
