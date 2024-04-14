package br.com.vaarias.Model.DAO.Interfaces;

import br.com.vaarias.Model.VO.Book;

import java.util.List;

public interface BookDAO {
    public Book getBook(Long id);
    public List<Book> getAllBooks();
}
