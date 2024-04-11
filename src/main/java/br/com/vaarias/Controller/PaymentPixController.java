package br.com.vaarias.Controller;

import br.com.vaarias.Services.ApiPIX;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentPixController implements Initializable {

    @FXML
    private ImageView imagePix;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String path = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=Example";
        ApiPIX apiPIX = new ApiPIX(path);
        Image qrCode = apiPIX.getQRCode(); // Removido o argumento apiUrl
        imagePix.setImage(qrCode);
    }
}