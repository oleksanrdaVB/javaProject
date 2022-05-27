package com.company;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myZoo.makeSound(myDog);
        myZoo.makeSound(myCat);
//        myDog.run();
//        myDog.makeSound();
//        myCat.run();
//        myCat.makeSound();
    }
}
