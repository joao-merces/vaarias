package br.com.vaarias.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Label recomendados;

    @FXML
    private Button btnLibrary;

    @FXML
    private Button botaoCriarEstante;

    @FXML
    private GridPane livroContainer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLibrary.setContentDisplay(ContentDisplay.LEFT);
    }

    @FXML
    void btnLibraryClicked(ActionEvent event) {
        System.out.println("Botao biblioteca clicado!");
    }

    @FXML
    void botaoCriarEstanteClicked(ActionEvent event) {

    }
}
