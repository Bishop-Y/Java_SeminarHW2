package org.example;

public final class Executive extends Manager {
    public Executive(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Executive " + super.toString() +
                " and with " + Manager.countOfManagers + " managers";
    }
}
