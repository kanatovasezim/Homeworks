package com.company;

public class Car {
    private int id;
    private String manufactureYear;
    private String model;
    private int price;
    private String color;

    public Car(int id, String manufactureYear, String model, int price, String color) {
        this.id = id;
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
