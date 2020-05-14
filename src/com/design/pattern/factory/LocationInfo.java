package com.design.pattern.factory;

public class LocationInfo {

    private String locationX;
    private String locationY;
    private String locationZ;

    public LocationInfo(String locationX, String locationY, String locationZ) {
        super();
        this.locationX = locationX;
        this.locationY = locationY;
        this.locationZ = locationZ;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getLocationZ() {
        return locationZ;
    }

    public void setLocationZ(String locationZ) {
        this.locationZ = locationZ;
    }

    @Override
    public String toString() {
        return "LocationInfo [locationX=" + locationX + ", locationY=" + locationY + ", locationZ=" + locationZ + "]";
    }
}
