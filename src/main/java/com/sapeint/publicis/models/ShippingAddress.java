package com.sapeint.publicis.models;

public class ShippingAddress {

    int x;
    int y;
    String flat;
    String buildingName;
    long zip;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public ShippingAddress(int x, int y, String flat, String buildingName, long zip) {
        this.x = x;
        this.y = y;
        this.flat = flat;
        this.buildingName = buildingName;
        this.zip = zip;
    }
}
