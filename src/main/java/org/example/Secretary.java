package org.example;

public final class Secretary extends Employee implements Gradable {
    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public String report() {
        return String.format(" reports: the company employs %d people", countOfEmployees);

    }

    @Override
    public String toString() {
        return "Secretary " + super.getName() + " with salary " + this.getSalary();
    }

    @Override
    public void increaseSalary() {
        this.salary += 50;
    }
}
