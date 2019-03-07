package com.step.assignments;

public class Vehicle {
    private int movingSpeed;

    public Vehicle(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }
    
    public void increaseSpeed(int speed){
        this.movingSpeed += speed; 
    }

    public void decreaseSpeed(int speed){
        this.movingSpeed -= speed;
    }

    public int getMovingSpeed(){
        return  this.movingSpeed;
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.