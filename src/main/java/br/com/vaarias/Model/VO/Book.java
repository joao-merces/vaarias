<<<<<<< HEAD
package br.com.vaarias.Model.VO;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Column(name = "book_author", nullable = false)
    private String author;
    @Column(name = "book_cover_url", nullable = false)
    private String coverUrl;
    @Column(name = "book_price", nullable = false)
    private double price;

    @ManyToMany
    @JoinTable(name = "tb_book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "ccgory_id"))
    private List<Category> categories = new ArrayList<>();

    public Book() {
    }

    public Book(Long id, String name, String author, String coverUrl, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.coverUrl = coverUrl;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
=======
package br.com.vaarias.Model.VO;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Column(name = "book_author", nullable = false)
    private String author;
    @Column(name = "book_cover_url", nullable = false)
    private String coverUrl;
    @Column(name = "book_price", nullable = false)
    private double price;

    @ManyToMany
    @JoinTable(name = "tb_book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "ccgory_id"))
    private List<Category> categories = new ArrayList<>();

    public Book() {
    }

    public Book(Long id, String name, String author, String coverUrl, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.coverUrl = coverUrl;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
>>>>>>> 44d8c04f4c493ac296c9aaa21285b63e1f048fc2
