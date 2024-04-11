package br.com.vaarias.Model.VO;

import jakarta.persistence.*;

@Table (name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Column(name = "book_author", nullable = false)
    private String author;
    @Column(name = "book_cover_url", nullable = false)
    private String coverUrl;
    @Column(name = "book_price", nullable = false)
    private double price;

    public Book() {
    }

    public Book(int id, String name, String author, String coverUrl, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.coverUrl = coverUrl;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
