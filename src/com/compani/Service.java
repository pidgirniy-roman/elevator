package com.compani;

public class Service {
    private final house house;

    public Service(com.compani.house house) {
        this.house = house;
    }


    public elivator call (int floor) {
        int min = house.getTotalFloors();
        elivator elivator = null;

        for (elivator e : house.getElivators()){
            int distance = Math.abs(e.getFloor() - floor);
            if (min > distance){
                min = distance;
                elivator = e;
            }
        }
        return elivator;
    }

    public int moveTo(elivator elivator, int floor){
        if (floor < 1 || floor > house.getTotalFloors()){
            return -1;
        }
        elivator.setFloor(floor);
        return floor;
    }



}
