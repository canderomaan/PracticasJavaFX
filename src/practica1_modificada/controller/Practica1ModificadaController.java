package practica1_modificada.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import practica1_modificada.enumerados.Sexo;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practica1ModificadaController implements Initializable {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnSalir;

    @FXML
    private ComboBox<Sexo> cboxSexo;

    @FXML
    private DatePicker dateFechaNacimiento;

    @FXML
    private Slider sliderEdad;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnEnviarClick(ActionEvent event) {
        Pattern patNombre = Pattern.compile("[A-Z][a-z]+");
        Pattern patApellidos = Pattern.compile("[A-Z][a-z]+([ ]+[A-Z][a-z]+)*");
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();

        Matcher matNombre = patNombre.matcher(nombre);
        Matcher matApellidos = patApellidos.matcher(apellidos);

        String sexo = cboxSexo.getValue().toString();
        String fechaNacimiento;
        if (dateFechaNacimiento.getValue() == null)
            fechaNacimiento = "";
        else
            fechaNacimiento = dateFechaNacimiento.getValue().toString();
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Fecha de nacimiento: "+fechaNacimiento);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);

        Alert alert;
        if (nombre.isEmpty() || apellidos.isEmpty() || sexo == null || edad.isEmpty() ||  fechaNacimiento.isEmpty()) {
            String res = "Falta por introducir ";
            if (nombre.isEmpty())
                res += "el nombre.";
            else if (apellidos.isEmpty())
                res += "el apellido.";
            else if (sexo==null)
                res += "el sexo.";
            else if (edad.isEmpty())
                res += "la edad.";
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campos incompletos...");
            alert.setHeaderText(null);
            alert.setContentText(res);
        }else if(matNombre.matches() && matApellidos.matches())  {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Campos introducidos.");
            alert.setHeaderText(null);
            alert.setContentText("Datos introducidos correctamente.\n" +
                    "Nombre: "+txtNombre+"\nApellido: "+txtApellidos+"\n" +
                    "Edad: "+edad+"\nFecha de nacimiento: "+fechaNacimiento+
                    "\nSexo: "+sexo);
        }else{
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Datos incorrectos...");
            alert.setHeaderText(null);
            alert.setContentText("Nombre y apellidos introducidos incorrectamente.");
            txtNombre.requestFocus();
        }
        alert.showAndWait();
    }


    @FXML
    void btnLimpiarClick(ActionEvent event) {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        dateFechaNacimiento.setValue(null);
        sliderEdad.setValue(0);
        cboxSexo.getSelectionModel().clearSelection();
        txtNombre.requestFocus();
    }

    @FXML
    void btnSalirClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cerrar aplicación...");
        alert.setHeaderText(null);
        alert.setContentText("¿Desea salir?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        }else
            txtNombre.requestFocus();


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cboxSexo.getItems().setAll(Sexo.values());
        cboxSexo.setPromptText("Elige el Sexo.");
        cboxSexo.setVisibleRowCount(2);
        sliderEdad.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                int edad = (int)sliderEdad.getValue();
                txtEdad.setText(String.valueOf(edad));
            }
        });

    }

}
