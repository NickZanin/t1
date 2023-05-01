package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hi, my name is " + name);
    }

    public void move(){
        System.out.println("I'm moving");
    }


}
