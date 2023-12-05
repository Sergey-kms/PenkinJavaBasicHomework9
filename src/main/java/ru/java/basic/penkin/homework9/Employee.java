package ru.java.basic.penkin.homework9;

import java.util.ArrayList;
import java.util.List;

public class Employee {         // В гитхаб vetka1
    private String name;
    private int age;

    public Employee(String имя, int возраст) {
        this.name = имя;
        this.age = возраст;
    }

    public String getName() {
        return name;
    }

    public void setName(String имя) {
        this.name = имя;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int возраст) {
        this.age = возраст;
    }

    public static List<String> getEmployeesNames(List<Employee> employees) {    // Имена сотрудников.
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> еmployeesAreOlder(List<Employee> employees, int минимальныйВозраст) {    // Сотрудники старше заданного возраста.
        List<Employee> older = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= минимальныйВозраст) {
                older.add(employee);
            }
        }
        return older;
    }

    public static boolean isAverageAgeAboveMin(List<Employee> employees, int минимальныйСреднийВозраст) {   // Проверка среднего возраста сотрудников, средний возраст превышает заданный минимальный средний возраст.
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.getAge();
        }
        int averageAge = sumAge / employees.size();
        return averageAge > минимальныйСреднийВозраст;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngestEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Александр", 43));
        employees.add(new Employee("Сергей", 36));
        employees.add(new Employee("Алексей", 23));
        employees.add(new Employee("Владимир", 31));
        employees.add(new Employee("Дмитрий", 57));


        List<String> names = getEmployeesNames(employees);
        System.out.println("Имена сотрудников: " + names);

        List<Employee> olderThan = еmployeesAreOlder(employees, 40);
        System.out.println("Сотрудники старше 40 лет: " + olderThan);

        boolean checkTheAverageAge = isAverageAgeAboveMin(employees, 25);
        System.out.println("Средний возраст сотрудников превышает 25: " + checkTheAverageAge);

        Employee youngestEmployee = getYoungestEmployee(employees);
        System.out.println("Самый молодой сотрудник: " + youngestEmployee.getName());
    }
}