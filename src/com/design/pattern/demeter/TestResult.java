package com.design.pattern.demeter;

public class TestResult {

    public static void main(String[] args) {
        BuildingCenter buildingCenter = new BuildingCenter();
        buildingCenter.addHouse();
        Buyer buyer = new Buyer();
        buyer.buyHouse("6栋", 150, 90, buildingCenter);
    }

}
