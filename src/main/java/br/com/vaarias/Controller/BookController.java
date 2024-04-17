package br.com.vaarias.Controller;

import br.com.vaarias.Model.VO.Book;
import br.com.vaarias.View.PaymentCreditCard;
import br.com.vaarias.View.PaymentPix;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookController {
    @FXML
    private VBox bookBox;

    @FXML
    private ImageView bookCover;

    @FXML
    private Label bookTitle;

    @FXML
    private Label bookAuthor;

    @FXML
    private Label labelPrice;


    private String[] colors = {
            "FFDAB9", // Pêssego
            "FFC0CB", // Rosa bebê
            "89CFF0", // Azul bebê
            "98FB98", // Verde menta
            "FFFACD", // Amarelo pastel
            "E6E6FA", // Lavanda
            "AFEEEE", // Turquesa
            "FF6F61", // Coral
            "87CEEB", // Azul celeste
            "00CED1", // Verde água
            "C8A2C8", // Lilás
            "FFFFE0", // Amarelo claro
            "ADD8E6", // Azul pálido
            "32CD32", // Verde limão
            "FFB6C1", // Rosa suave
            "87CEEB", // Azul-piscina
            "FFE5B4", // Pêssego claro
            "93C572"  // Verde pistache
    };

    @FXML
    void btnBuyCardClicked(ActionEvent event) throws Exception {
        PaymentCreditCard paymentCreditCard = new PaymentCreditCard();
        Stage stage = new Stage();
        paymentCreditCard.start(stage);
    }

    @FXML
    void btnBuyPixClicked(ActionEvent event) throws Exception {
        PaymentPix paymentPix = new PaymentPix();
        Stage stage = new Stage();
        paymentPix.start(stage);
    }

    public void setData(Book book) {
        bookTitle.setText(book.getName());
        bookAuthor.setText(book.getAuthor());
        String coverUrl = book.getCoverUrl();
        Image img = new Image(coverUrl);
        bookCover.setImage(img);
        String priceString = String.valueOf(book.getPrice());
        labelPrice.setText("R$ " + priceString);

        bookBox.setStyle("-fx-background-color: #" + colors[(int) (Math.random() * colors.length)] + ";"
                + "-fx-background-radius: 15;");
    }
}
