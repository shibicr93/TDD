package com.tw.transaction;

public class User {

    private String name;
    private long id;

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public long getId() {
        return id;
    }
}
