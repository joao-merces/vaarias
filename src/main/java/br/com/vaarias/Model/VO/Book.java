package br.com.vaarias.Model.VO;

public class Book {
    private int id;
    private String name;
    private String author;
    private String coverUrl;
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