package com.company;

public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int result1 = math.calc(10, 5);
        float result2 = math.calc(8, 12.5F);
        double result3 = math.calc(6, 7.3);
        System.out.println("int: " + result1);
        System.out.println("float: " + result2);
        System.out.println("double: " + result3);

    }
}
