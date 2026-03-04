package abriendo_ventanas.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import practicaListaPersonas.model.Persona;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonasVistaController implements Initializable {

    @FXML
    private Button btnAgregarPersona;

    @FXML
    private TableColumn<?, ?> colApellidos;

    @FXML
    private TableColumn<?, ?> colEdad;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<?> tblPersonas;

    private ObservableList<Persona> personas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnAgregarPersona.setOnAction(this::agregarPersonas);
        personas = FXCollections.observableArrayList();
    }

    private void agregarPersonas(ActionEvent actionEvent) {

    }
}
