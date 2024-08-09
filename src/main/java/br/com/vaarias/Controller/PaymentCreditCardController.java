package br.com.vaarias.Controller;

import br.com.vaarias.Model.DAO.Implementations.CreditCardDAOImpl;
import br.com.vaarias.Model.VO.CreditCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PaymentCreditCardController implements Initializable {

    @FXML
    private TextField entryCardNumber;

    @FXML
    private TextField entryName;

    @FXML
    private TextField entryVerificationCode;

    @FXML
    private DatePicker entryExpirationDate;

    @FXML
    private Label labelSucces;

    @FXML
    private Label labelFailed;

    @FXML
    void btnBuy(ActionEvent event) {

        String name = entryName.getText();
        String number = entryCardNumber.getText();
        String verificationCode = entryVerificationCode.getText();
        LocalDate expirationDate = entryExpirationDate.getValue();

        if(name.isEmpty() || number.isEmpty() ||
           verificationCode.isEmpty() || expirationDate == null) {
            labelFailed.setVisible(true);
        } else {
            CreditCardDAOImpl creditCardDAO = new CreditCardDAOImpl();
            CreditCard creditCard = new CreditCard();

            creditCard.setClientName(name);
            creditCard.setNumber(number);
            creditCard.setVerificationCode(verificationCode);
            creditCard.setCardExpiration(expirationDate);

            creditCardDAO.saveCard(creditCard);
            labelSucces.setVisible(true);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelSucces.setVisible(false);
        labelFailed.setVisible(false);
    }
}