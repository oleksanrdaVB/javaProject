package com.company;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I can say woof-woof!");
    }

    public void run() {
        super.run();
    }
}

