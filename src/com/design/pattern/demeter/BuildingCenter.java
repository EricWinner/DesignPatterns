package com.design.pattern.demeter;

import java.util.ArrayList;
import java.util.Random;

public class BuildingCenter {

    private ArrayList<House> mHouses = new ArrayList<House>();

    public BuildingCenter() {
    }

    /**
     * 初始化房源
     */
    public void addHouse() {
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            mHouses.add(new House(random.nextInt(10) + "栋", random.nextInt(100) + 100, random.nextInt(20) + 100));
        }
    }

    /**
     * 卖房子
     * @param location
     * @param price
     * @param area
     * @return
     */
    public House sellHouse(String location, int price, int area) {
        for (House house : mHouses) {
            if (isSuitHouse(location, price, area, house)) {
                return house;
            }
        }
        return null;
    }

    /**
     * 是否合适
     * @param location
     * @param price
     * @param area
     * @param house
     * @return
     */
    private boolean isSuitHouse(String location, int price, int area, House house) {
        if (house.getLocation().equals(location)) {
            if (house.getPrice() <= price && house.getArea() >= area) {
                return true;
            }
        }
        return false;
    }
}
