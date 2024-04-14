package br.com.vaarias.Controller;

import br.com.vaarias.Model.DAO.Implementations.BookDAOImpl;
import br.com.vaarias.Model.DAO.Interfaces.BookDAO;
import br.com.vaarias.Model.VO.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

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
    private Button btnUser;

    @FXML
    private Button botaoCriarEstante;

    @FXML
    private GridPane livroContainer;

    @FXML
    private Button btnFavorite;

    @FXML
    private GridPane bookContainer;

    private List<Book> RecommendedBooks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BookDAOImpl bookDAO = new BookDAOImpl();
        RecommendedBooks = bookDAO.getAllBooks();
        int column = 0;
        int row = 1;
        try{
            for(Book book: RecommendedBooks) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/View/Book.fxml"));
                VBox bookBox = loader.load();
                BookController bookController = loader.getController();
                bookController.setData(book);

                if(column == 4) {
                    column = 0;
                    ++row;
                }

                bookContainer.add(bookBox, column++, row);
                GridPane.setMargin(bookBox, new Insets(28));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    @FXML
    void btnUserClicked(ActionEvent event) {
        System.out.println("Button user clicked");
    }
}