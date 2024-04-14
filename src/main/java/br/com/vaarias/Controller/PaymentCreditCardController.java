package br.com.vaarias.Controller;

import br.com.vaarias.Model.DAO.Implementations.CreditCardDAOImpl;
import br.com.vaarias.Model.VO.CreditCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class PaymentCreditCardController {

    @FXML
    private TextField entryCardNumber;

    @FXML
    private TextField entryName;

    @FXML
    private TextField entryVerificationCode;

    @FXML
    private Button btnBuy;

    @FXML
    private DatePicker entryExpirationDate;

    @FXML
    void btnBuy(ActionEvent event) {
        String name = entryName.getText();
        String number = entryCardNumber.getText();
        String verificationCode = entryVerificationCode.getText();
        LocalDate expirationDate = entryExpirationDate.getValue();

        CreditCardDAOImpl creditCardDAO = new CreditCardDAOImpl();
        CreditCard creditCard = new CreditCard();

        creditCard.setClientName(name);
        creditCard.setNumber(number);
        creditCard.setVerificationCode(verificationCode);
        creditCard.setCardExpiration(expirationDate);

        creditCardDAO.saveCard(creditCard);
    }
}