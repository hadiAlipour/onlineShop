package com.company;

public class Shoes extends Product {
    private Integer size;
    private String Brand;
    private String color;
    private String type;

    public Shoes(Integer id, String name, String description, Double price, Integer count, Integer size, String brand, String color, String type) {
        super(id,name, description, price, count);
        this.size = size;
        Brand = brand;
        this.color = color;
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
