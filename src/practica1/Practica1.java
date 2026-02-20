package practica1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Practica1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public Practica1() {

    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public void stop() throws Exception {

    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Método start.");
        Parent root = FXMLLoader.load(getClass().getResource("practica1.vista.ejemplo.fxml"));
        stage.setTitle("Practica 1");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
