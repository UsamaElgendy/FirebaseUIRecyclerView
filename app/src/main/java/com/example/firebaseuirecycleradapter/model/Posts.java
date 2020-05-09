package com.example.firebaseuirecycleradapter.model;

public class Posts {
    private String name, image;

    public Posts(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Posts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
