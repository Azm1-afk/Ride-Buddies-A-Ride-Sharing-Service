package com.mycompany.filehandling;

public class Person {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "name : " + this.name + ", age : " + this.age;
    }
}
