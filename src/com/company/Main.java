package com.company;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> Customers = new HashMap<String, String>();
        Customers.put("1", "Erik Horlings");
        Customers.put("2", "Wilfred van der Plaats");
        Customers.put("3", "Wiepko Bos");
        Customers.put("4", "Dewi Bakker");
        Customers.put("5", "Gokhan Poyraz");

        System.out.println("Name at value 2: "+ Customers.get("2"));

        String removedValue = Customers.remove("4");
        System.out.println("Removed value: " + removedValue);

        System.out.println("Updated HashMap: " + Customers);

    }

}
