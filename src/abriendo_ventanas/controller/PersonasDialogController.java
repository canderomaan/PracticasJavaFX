package abriendo_ventanas.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonasDialogController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
