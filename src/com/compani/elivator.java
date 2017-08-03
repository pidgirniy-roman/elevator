package com.compani;

public class elivator {

    private int floor;
    private int id;

    public elivator() {
    }

    public elivator(int floor, int id) {
        this.floor = floor;
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getinfo() {
        return id + ", " + floor;
    }
}
