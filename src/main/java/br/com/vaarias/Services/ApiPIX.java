package br.com.vaarias.Services;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiPIX {
    private String apiUrl;

    public ApiPIX(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public Image getQRCode() {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedImage bufferedImage = ImageIO.read(connection.getInputStream());
                Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                return image;
            } else { return null;}
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
