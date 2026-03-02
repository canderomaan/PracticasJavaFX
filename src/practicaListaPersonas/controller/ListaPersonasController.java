package practicaListaPersonas.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import practicaListaPersonas.model.Persona;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaPersonasController implements Initializable {

    @FXML
    private Button btnModificar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableColumn<?, ?> colApellidos;

    @FXML
    private TableColumn<?, ?> colEdad;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    private ObservableList<Persona> personas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnAgregar.setOnAction(this::agregarPersona);
        btnModificar.setOnAction(this::modificarPersona);
        btnEliminar.setOnAction(this::eliminarPersona);
        personas = FXCollections.observableArrayList();
        tblPersonas.setOnMouseClicked(this::seleccionarPersona);
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
    }

    private void seleccionarPersona(MouseEvent mouseEvent) {
        Persona p = tblPersonas.getSelectionModel().getSelectedItem();
        if (p!=null){
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellidos());
            txtEdad.setText(p.getEdad() + "");
        }else{
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
        }
    }

    private void eliminarPersona(ActionEvent actionEvent) {

    }

    private void modificarPersona(ActionEvent actionEvent) {

    }

    private void agregarPersona(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        String apellidos = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Persona persona = new Persona(nombre,apellidos,edad);

        if(!personas.contains(persona)){
            personas.add(persona);
            tblPersonas.setItems(personas);
        }else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error");
            a.setHeaderText(null);
            a.setContentText("Persona ya existe");
            a.showAndWait();
        }
    }
}
