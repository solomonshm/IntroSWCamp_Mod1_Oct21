package com.hms.books;

public class Book {

    private String title;
    private double price;
    private Author author;
    private Publisher publisher;
    private double saleDiscount;

    public Book(String title, Author author, Publisher publisher, double price) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public double calculateSalePrice() {
        return (price - price * (saleDiscount / 100));
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
