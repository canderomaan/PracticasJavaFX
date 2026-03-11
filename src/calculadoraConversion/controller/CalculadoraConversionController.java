package calculadoraConversion.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculadoraConversionController implements Initializable {

    @FXML
    private Button btnConvertir;

    @FXML
    private RadioButton rdbBinDestino;

    @FXML
    private RadioButton rdbBinOrigen;

    @FXML
    private RadioButton rdbDecimalDestino;

    @FXML
    private RadioButton rdbDecimalOrigen;

    @FXML
    private RadioButton rdbHexDestino;

    @FXML
    private RadioButton rdbHexOrigen;

    @FXML
    private RadioButton rdbOctalDestino;

    @FXML
    private RadioButton rdbOctalOrigen;

    @FXML
    private TextField txtFormato;

    @FXML
    private TextField txtResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
    }
}
