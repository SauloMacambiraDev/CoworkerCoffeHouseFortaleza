package com.saulomacambira.coworkercoffehousefortaleza;

import androidx.annotation.DrawableRes;

public class Room {
    private int id;
    private String title;
    private String description;
    private int imageResourceId;
    private double price;
    private int capacityOfPeople;
    private float rating;
    private int totalNumberOfRates;

    public Room(int id, String title, String description, @DrawableRes int imageResourceId, double price, int capacityOfPeople, float rating, int totalNumberOfRates) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.price = price;
        this.capacityOfPeople = capacityOfPeople;
        this.rating = rating;
        this.totalNumberOfRates = totalNumberOfRates;
    }


    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getTotalNumberOfRates() {
        return totalNumberOfRates;
    }

    public void setTotalNumberOfRates(int totalNumberOfRates) {
        this.totalNumberOfRates = totalNumberOfRates;
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

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }
}
