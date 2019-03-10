package com.step.assignments.instancemethods;

public class Floor {
    public static void main(String[] args) {

    }

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width<0){
            this.width =0;
        }
        if (this.length<0){
            this.length =0;
        }
    }

    public double getArea(){
        return this.width*this.length;
    }
}
