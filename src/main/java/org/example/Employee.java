package org.example;

public abstract class Employee {
    protected static int countOfEmployees;
    private final String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        ++countOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee " + this.getName() + " with salary " + this.getSalary();
    }
}
