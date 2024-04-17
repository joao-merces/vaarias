package br.com.vaarias.Controller;

import br.com.vaarias.Model.DAO.Implementations.UserDAOImpl;
import br.com.vaarias.Model.VO.User;
import br.com.vaarias.Services.*;
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
    private TextField inputEmail;

    @FXML
    private DatePicker inputBirthday;

    @FXML
    private PasswordField inputPassword;

    @FXML
    private TextField inputName;

    @FXML
    private Label labelErrorAlert;

    @FXML
    private Label labelSuccess;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelErrorAlert.setVisible(false);
        labelSuccess.setVisible(false);
    }

    @FXML
    void btnSignUpClicked(ActionEvent event) throws Exception {

        UserDAOImpl userDAO = new UserDAOImpl();

        Checker cheker = new Checker();
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();

        String name = inputName.getText();
        String password = inputPassword.getText();
        String email = inputEmail.getText();
        String cpf = inputCPF.getText();
        LocalDate birthday = inputBirthday.getValue();

        if(!(cheker.checkAllEmpty(cpf, name, email, password)) &
                !(cheker.checkPatternAll(cpf, email, password))) {
            labelErrorAlert.setText("Verifique os dados e tente novamente!");
            labelErrorAlert.setVisible(true);
        } else {
            User user = new User();

            user.setPassword(encryptDecrypt.encrypt(password));
            user.setName(name);
            user.setEmail(email);
            user.setCpf(cpf);
            user.setBirthday(inputBirthday.getValue());
            userDAO.saveUser(user);
            labelSuccess.setVisible(true);
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
