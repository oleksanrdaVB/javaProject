package com.company;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.run();
        myDog.makeSound();
        myCat.run();
        myCat.makeSound();
    }
}
