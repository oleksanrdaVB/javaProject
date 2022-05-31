package com.company;

public class Main {

    public static void main(String[] args) {
        Wind W = new Wind();
        River R = new River();

        identifyElement(W);
        identifyElement(R);
    }

    public static void identifyElement(IElement element) {
        System.out.println(element.getElementName());
    }
}
