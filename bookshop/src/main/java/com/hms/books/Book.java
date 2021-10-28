package com.hms.books;

public class Book extends Product {

    private Author author;
    private Publisher publisher;
    private double saleDiscount;
    static int bookCount = 0;

    public Book(String title, Author author, Publisher publisher, double price) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
        bookCount += 1;
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

    public void printer() {
        System.out.println(this);
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

    public static int getCount() {
        return bookCount;
    }


}
