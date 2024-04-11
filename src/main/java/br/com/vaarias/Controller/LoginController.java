package br.com.vaarias.Controller;

import br.com.vaarias.View.Home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSignUp;

    @FXML
    private TextField inputEmail;

    @FXML
    private PasswordField inputPassword;

    @FXML
    void btnSignUpClicked(ActionEvent event) {

    }

    @FXML
    void btnLoginClicked(ActionEvent event) throws Exception {
        Home home = new Home();
        Stage stage = new Stage();
        home.start(stage);

        stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }
}
