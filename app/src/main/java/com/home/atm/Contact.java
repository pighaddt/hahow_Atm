package com.home.atm;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    int id;
    String name;
//    String phone;
    List<String> phones = new ArrayList<>();

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

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Contact(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
