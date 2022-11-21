package org.example;

public final class Programmer extends Employee implements Gradable {

    private final String language;

    public Programmer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
}

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Programmer " + this.getName() + " on " + this.getLanguage() +
                " language with salary " + this.getSalary();
    }

    @Override
    public void increaseSalary() {
        this.salary += 200;
    }
}
