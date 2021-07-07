package com.mariodls;

import com.mariodls.com.mariodls.Animal;

public class Fish extends Animal {

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest() {
        System.out.println("Fish.rest() called");
    }

    private void moveMuscles() {
        System.out.println("Fish. moveMuscles() called");
    }

    private void moveFin() {
        System.out.println("Fish.moveFin() called");
    }

    private void swim(int speed) {
        moveMuscles();
        moveFin();
        super.move(speed);
    }

}
