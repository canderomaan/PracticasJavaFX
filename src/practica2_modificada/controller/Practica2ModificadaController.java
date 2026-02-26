package practica2_modificada.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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

    }
}
