package br.com.vaarias.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Login.fxml"));;
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Vaarias - Bem Vindo!");
        stage.setScene(scene);
        stage.setHeight(600);
        stage.setWidth(400);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
