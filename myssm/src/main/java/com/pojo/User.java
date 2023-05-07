package com.pojo;

public class User {
    private int id;
    private String name;
    private String type;
    private String discription;

    public User() {
    }

    public User(int id, String name, String type, String discription) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.discription = discription;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", discriptiion='" + discription + '\'' +
                '}';
    }
}