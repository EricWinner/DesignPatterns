package com.design.pattern.demeter;

public class Buyer {

    /**
     * 买房子
     * @param location
     * @param price
     * @param area
     * @param buildingCenter
     */
    public void buyHouse(String location, int price, int area, BuildingCenter buildingCenter) {
        House house = buildingCenter.sellHouse(location, price, area);
        if (house != null) {
            System.out.println("买到房子了：" + house.toString());
        } else {
            System.out.println("没有合适的房子！");
        }
    }
}
