package com.hms.books;

public class Author extends Person {

    private String genre;

    public Author(String name, Address address, String genre) {
        super(name, address);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
