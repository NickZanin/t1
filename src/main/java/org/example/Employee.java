package org.example;

public class Employee {

   private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return baseSalary;
    }

    public void setSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


}
