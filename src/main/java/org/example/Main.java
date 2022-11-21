package org.example;

public class Main {
    public static void main(String[] args) {
        Programmer programmer_1 = new Programmer("Clark", 1000, "Java");
        Programmer programmer_2 = new Programmer("John", 1000, "C#");
        Programmer programmer_3 = new Programmer("George", 1200, "C++");
        Manager manager_1 = new Manager("Robert", 2000);
        manager_1.setBonus(500);
        Manager manager_2 = new Manager("Antonio", 2000);
        manager_2.setBonus(300);
        Executive boss = new Executive("Bishop", 5000);
        boss.setBonus(1000);
        Secretary secretary = new Secretary("Eve", 800);
        Employee[] workers = new Employee[7];
        workers[0] = programmer_1;
        workers[1] = programmer_2;
        workers[2] = programmer_3;
        workers[3] = manager_1;
        workers[4] = manager_2;
        workers[5] = boss;
        workers[6] = secretary;
        for (Employee employee : workers) {
            if (employee instanceof Gradable g) {
                g.increaseSalary();
            }
            if (employee instanceof Secretary s) {
                System.out.println(employee + s.report());;
            } else {
                System.out.println(employee);
            }
        }
    }
}