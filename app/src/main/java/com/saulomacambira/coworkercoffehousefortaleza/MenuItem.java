package com.saulomacambira.coworkercoffehousefortaleza;

public class MenuItem {
    private int id;
    private String title;
    private String description;
    private double price;
    private int imageResourceId;

    public MenuItem(int id, String title, String description, double price, int imageResourceId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
