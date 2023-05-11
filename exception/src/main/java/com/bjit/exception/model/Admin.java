package com.bjit.exception.model;

public class Admin extends User{
    private String position;

    public Admin() {
    }

    public Admin(int id, String name, String position) {
        super(id, name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
