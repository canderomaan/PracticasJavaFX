package practica2_modificada.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import practica2_modificada.model.Operacion;

import java.net.URL;
import java.util.ResourceBundle;

public class Practica2ModificadaController implements Initializable {

    @FXML
    private Button btnOperar;

    @FXML
    private RadioButton rdbDividir;

    @FXML
    private RadioButton rdbMultiplicar;

    @FXML
    private RadioButton rdbRestar;

    @FXML
    private RadioButton rdbSumar;

    @FXML
    private TextField txtOp1;

    @FXML
    private TextField txtOp2;

    @FXML
    private TextField txtResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        this.rdbDividir.setToggleGroup(toggleGroup);
        rdbMultiplicar.setToggleGroup(toggleGroup);
        rdbRestar.setToggleGroup(toggleGroup);
        rdbSumar.setToggleGroup(toggleGroup);

        btnOperar.setOnAction(this::realizarOperacion);
    }

    private void realizarOperacion(ActionEvent actionEvent) {
        int op1 = Integer.parseInt(txtOp1.getText());
        int op2 = Integer.parseInt(txtOp2.getText());
        Operacion operacion = new Operacion(op1, op2);
        if (rdbMultiplicar.isSelected()) {
            txtResultado.setText(operacion.multiplicar()+"");
        }else if (rdbRestar.isSelected()) {
            txtResultado.setText(operacion.restar()+"");
        } else if (rdbDividir.isSelected()) {
            if (op2==0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText(null);
                alert.setContentText("El Operador 2 no puede ser 0.");
                alert.showAndWait();
            }else
                txtResultado.setText(operacion.dividir()+"");
        } else if (rdbSumar.isSelected()) {
            txtResultado.setText(operacion.sumar()+"");
        }else {
            Alert alerta;
            alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("");
            alerta.setHeaderText(null);
            alerta.setContentText("No has seleccionado ningún botón.");
            alerta.showAndWait();
        }
    }
}
