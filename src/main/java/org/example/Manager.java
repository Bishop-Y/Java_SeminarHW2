package org.example;

public class Manager extends Employee {

    private int bonus;
    protected static int countOfManagers = -1;

    public Manager(String name, int salary) {
        super(name, salary);
        ++countOfManagers;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int getBonus() {
        return bonus;
    }


    @Override
    public int getSalary() {
        int previous_salary = super.getSalary();
        return previous_salary + bonus;
    }


    @Override
    public String toString() {
        return "Manager " + super.getName() + " with salary " + this.getSalary() +
                " that includes bonus " + this.getBonus() ;
    }
}
