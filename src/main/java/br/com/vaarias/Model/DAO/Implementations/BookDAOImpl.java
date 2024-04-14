package br.com.vaarias.Model.DAO.Implementations;

import br.com.vaarias.Model.VO.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BookDAOImpl {
    EntityManager manager;

    public BookDAOImpl() {
        manager = ConnectDBImpl.getInstance();
    }

    public Book getBook(Long id) {
        return manager.find(Book.class, id);
    }

    public List<Book> getAllBooks() {
        TypedQuery<Book> query = manager.createQuery("SELECT b FROM Book b", Book.class);
        return query.getResultList();
    }
}
