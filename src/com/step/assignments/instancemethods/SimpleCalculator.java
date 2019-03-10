package com.step.assignments.instancemethods;

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }

    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber ==0){
            return 0;
        }
        return this.firstNumber/this.secondNumber;
    }

}