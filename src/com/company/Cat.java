package com.company;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I can say meow-meow!");
    }

    public void run() {
        super.run();
    }
}
