package com.design.pattern.demeter;

public class House {

    private String location;
    private int price;
    private int area;

    public House(String location, int price, int area) {
        super();
        this.location = location;
        this.price = price;
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public float getPrice() {
        return price;
    }

    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "House [location=" + location + ", price=" + price + ", area=" + area + "]";
    }

}
