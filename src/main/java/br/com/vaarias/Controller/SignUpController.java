package br.com.vaarias.Controller;

import br.com.vaarias.View.Home;
import br.com.vaarias.View.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private TextField inputCPF;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnSignUp;

    @FXML
    private TextField inputEmail;

    @FXML
    private DatePicker inputBirthday;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private TextField inputName;

    @FXML
    void btnSignUpClicked(ActionEvent event) {

    }

    @FXML
    void btnBackClicked(ActionEvent event) throws Exception {
        Login login = new Login();
        Stage stage = new Stage();
        login.start(stage);

        stage = (Stage) btnBack.getScene().getWindow();
        stage.close();
    }
}
