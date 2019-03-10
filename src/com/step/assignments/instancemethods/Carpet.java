package com.step.assignments.instancemethods;

public class Carpet {
    public static void main(String[] args) {

    }
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if (cost<0){
            this.cost =0;
        }
    }

    public double getCost() {
        return cost;
    }
}
