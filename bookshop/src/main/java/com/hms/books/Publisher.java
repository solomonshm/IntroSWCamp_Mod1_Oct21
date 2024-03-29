package com.hms.books;

public class Publisher extends Person {

    private String organisation;

    public Publisher(String name, Address address, String organisation) {
        super(name, address);
        this.organisation = organisation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
