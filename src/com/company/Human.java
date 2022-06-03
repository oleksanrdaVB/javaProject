package com.company;

class Human {
   String name;
   int age;
   String city;

   public Human (String name, int age, String city){
       this.name = name;
       this.age = age;
       this.city = city;
   }

   public String getName() {
       return this.name;
   }

   public int getAge() {
       return this.age;
   }

   public String getCity() {
       return this.city;
   }
}


