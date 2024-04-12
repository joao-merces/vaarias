package br.com.vaarias.Controller;

import br.com.vaarias.Model.RN.SignUpRN;
import br.com.vaarias.Services.CheckCPF;
import br.com.vaarias.Services.EncryptDecrypt;
import br.com.vaarias.Services.CheckEmail;
import br.com.vaarias.View.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

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
    private Label labelErrorAlert;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelErrorAlert.setVisible(false);
    }

    @FXML
    void btnSignUpClicked(ActionEvent event) throws Exception {

        SignUpRN signUpRN = new SignUpRN();

        String name = inputName.getText();
        String password = inputPassword.getText();
        String email = inputEmail.getText();
        String cpf = inputCPF.getText();
        LocalDate birthday = inputBirthday.getValue();

        if(signUpRN.checkEmailEmpty(email) && signUpRN.checkPasswordEmpty(password) &&
          signUpRN.checkNameEmpty(name) && signUpRN.checkCPFEmpty(cpf)) {

        } else {
            labelErrorAlert.setText("Verifique se todos os campos foram preenchidos!");
            labelErrorAlert.setVisible(true);
        }
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
