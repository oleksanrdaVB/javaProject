package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1996, "Kyiv", "KPI", "Kyiv, Peremogy avenue");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCity());
        System.out.println(student.getCollegeName());
        System.out.println(student.getCollegeLocation());
    }
}
