package com.company;

public class Car {
    private String color;
    private String brand;

    public Car setColor(String color){
        this.color = color;
        return this;
    }
    public Car setBrand(String brand){
        this.brand = brand;
        return this;
    }
    public void showCar(){
        System.out.println("The car's color is: " +color);
        System.out.println("The car's brand is: "+brand);
    }
}
