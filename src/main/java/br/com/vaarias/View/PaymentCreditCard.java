package br.com.vaarias.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentCreditCard extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PaymentCreditCard.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Vaarias - Home");
        stage.setScene(scene);
        stage.setWidth(437);
        stage.setHeight(341);
        stage.setResizable(false);
        stage.show();
    }
}
