package com.company;

public class Student extends Human implements IStudentInfo {
    String collegeName;
    String collegeLocation;

    public Student(String name, int age, String city, String collegeName, String collegeLocation) {
        super(name, age, city);
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
    }

    public String getCollegeName() {
        return this.collegeName;
    }

    public String getCollegeLocation() {
        return this.collegeLocation;
    }
}
