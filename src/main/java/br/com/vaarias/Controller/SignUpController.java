package br.com.vaarias.Controller;

import br.com.vaarias.Services.CheckCPF;
import br.com.vaarias.Services.EncryptDecrypt;
import br.com.vaarias.Services.CheckEmail;
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
    void btnSignUpClicked(ActionEvent event) throws Exception {

        CheckEmail checkEmail = new CheckEmail();
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        CheckCPF checkCPF = new CheckCPF();

        String password = inputPassword.getText();
        String email = inputEmail.getText();
        String cpf = inputCPF.getText();

        System.out.println("Senha: " + password);
        String encryptedPassword = encryptDecrypt.encrypt(password);
        System.out.println("Senha criptografada: " + encryptedPassword);
        String decryptedPassword = encryptDecrypt.decrypt(encryptedPassword);
        System.out.println("Senha desincriptografada: " + decryptedPassword);
        System.out.println("");
        System.out.println("email: " + email);
        if(checkEmail.CheckEmailPattern(email)) {
            System.out.println("Email valido");
        } else System.out.println("Email invalido");
        System.out.println("");
        System.out.println("CPF: " + cpf);
        if(checkCPF.CheckCPFPattern(cpf)) {
            System.out.println("CPF válido");
        } else System.out.println("CPF inválido");
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
