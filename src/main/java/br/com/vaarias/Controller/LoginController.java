package br.com.vaarias.Controller;

import br.com.vaarias.Services.LogIn;
import br.com.vaarias.View.Home;
import br.com.vaarias.View.SignUp;
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
    void btnSignUpClicked(ActionEvent event) throws Exception {
        SignUp signUp = new SignUp();
        Stage stage = new Stage();
        signUp.start(stage);

        stage = (Stage) btnSignUp.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnLoginClicked(ActionEvent event) throws Exception {
        String email = inputEmail.getText();
        String password = inputPassword.getText();
        LogIn logIn = new LogIn();
        if (logIn.isUserValid(email, password) == true) {
            Home home = new Home();
            Stage stage = new Stage();
            home.start(stage);

            stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
        }
    }
}
