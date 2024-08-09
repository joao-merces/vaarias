<<<<<<< HEAD
package br.com.vaarias.Controller;

import br.com.vaarias.Services.ApiPIX;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentPixController implements Initializable {

    @FXML
    private ImageView imagePix;
    @FXML
    private Label label;

    public void callApiPaymentPix() {
        String url = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=Example";
        ApiPIX apiPIX = new ApiPIX(url);
        Image qrCode = apiPIX.getQRCode();
        imagePix.setImage(qrCode);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText("É só ler o QRCode ao lado\ne esperar alguns segundos");
        callApiPaymentPix();
    }
}
=======
package br.com.vaarias.Controller;

import br.com.vaarias.Services.ApiPIX;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentPixController implements Initializable {

    @FXML
    private ImageView imagePix;
    @FXML
    private Label label;

    public void callApiPaymentPix() {
        String url = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=Example";
        ApiPIX apiPIX = new ApiPIX(url);
        Image qrCode = apiPIX.getQRCode();
        imagePix.setImage(qrCode);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText("É só ler o QRCode ao lado\ne esperar alguns minutos 😉");
        callApiPaymentPix();
    }
}
>>>>>>> 44d8c04f4c493ac296c9aaa21285b63e1f048fc2
