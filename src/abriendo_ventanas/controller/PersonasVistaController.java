package abriendo_ventanas.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonasVistaController implements Initializable {

    @FXML
    private Button btnAgregarPersona;

    @FXML
    private TableColumn<?, ?> tblPersonas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
