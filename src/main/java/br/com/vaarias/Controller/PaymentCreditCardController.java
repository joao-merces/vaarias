package br.com.vaarias.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PaymentCreditCardController {

    @FXML
    private TextField entryCardNumber;

    @FXML
    private TextField entryCPF;

    @FXML
    private TextField entryName;

    @FXML
    private TextField entryVerificationCode;

    @FXML
    private Button btnBuy;

    @FXML
    void btnBuy(ActionEvent event) {
        System.out.println("Button Buy Clicked");
    }
}