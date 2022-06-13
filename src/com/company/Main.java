package com.company;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("first string");
        strList.add("second");
        strList.add("third");

        System.out.println(findString(strList, "second"));
        System.out.println(findString(strList, "fourth"));
    }

    public static boolean findString(ArrayList<String> strList, String str) {
        AtomicBoolean isSubstringFound = new AtomicBoolean(false);

        strList.forEach((strItem) -> {
            if (strItem == str) {
                isSubstringFound.set(true);
            }
        });

        return isSubstringFound.get();
    }
}
