<<<<<<< HEAD
package br.com.vaarias.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentPix extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PaymentPix.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Vaarias - Home");
        stage.setScene(scene);
        stage.setWidth(590);
        stage.setHeight(425);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

=======
package br.com.vaarias.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentPix extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PaymentPix.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Vaarias - Home");
        stage.setScene(scene);
        stage.setWidth(590);
        stage.setHeight(425);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

>>>>>>> 44d8c04f4c493ac296c9aaa21285b63e1f048fc2
