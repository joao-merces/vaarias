package br.com.vaarias.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HomeController {

    @FXML
    private Button btnHistory;

    @FXML
    private Label recomendados;

    @FXML
    private Button btnExplore;

    @FXML
    private Button btnTopRated;

    @FXML
    private Button btnCategories;

    @FXML
    private Button btnLibrary;

    @FXML
    private Button botaoCriarEstante;

    @FXML
    private GridPane livroContainer;

    @FXML
    private Button btnFavorite;

    @FXML
    void btnTopRatedClicked(ActionEvent event) {
        System.out.println("Button Top Rated Clicked");
    }

    @FXML
    void btnExploreClicked(ActionEvent event) {
        System.out.println("Button Explore Clicked");
    }

    @FXML
    void btnCategoriesClicked(ActionEvent event) {
        System.out.println("Button Categories Clicked");
    }

    @FXML
    void btnLibraryClicked(ActionEvent event) {
        System.out.println("Button Library Clicked");
    }

    @FXML
    void btnFavoriteClicked(ActionEvent event) {
        System.out.println("Button Favorites Clicked");
    }

    @FXML
    void btnHistoryClicked(ActionEvent event) {
        System.out.println("Button History Clicked");
    }

    @FXML
    void botaoCriarEstanteClicked(ActionEvent event) {
        System.out.println("Button Shelf Clicked");
    }
}