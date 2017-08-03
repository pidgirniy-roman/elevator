package com.compani;

public class brain {

    public static void main(String[] args) {


    elivator elivator1 = new elivator(1, 1);
    elivator elivator2 = new elivator(1, 2);
    elivator elivator3 = new elivator(1, 3);

    house house = new house(10, elivator1, elivator2, elivator3);
    System.out.println(elivator1.getinfo());
    System.out.println(house.getinfo());
    }
}
