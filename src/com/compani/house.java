package com.compani;

public class house {
    private int totalFloors;
    private elivator[] elivators;

    public house() {
    }

    public house(int totalFloors, elivator... elivators) {
        this.totalFloors = totalFloors;
        this.elivators = elivators;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public elivator[] getElivators() {
        return elivators;
    }

    public void setElivators(elivator... elivators) {
        this.elivators = elivators;
    }

    public String getinfo() {
        String info = "Total floors:" + totalFloors + "\n";
        for (elivator elivator : elivators){
            info += "elivator: " + elivator.getinfo() + "\n";
        }
        return info;
    }
}
