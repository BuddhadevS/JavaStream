package com.tek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(10, "Indra", 90000, "defence"),
                new Employee(11, "Prosen", 55000, "medical"),
                new Employee(12, "Bunai", 25000, "it"),
                new Employee(13, "kushal", 20000, "medical"),
                new Employee(14, "Sita", 15000, "it")
        );
        Map<String, Double> map= employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.summingDouble(Employee::getSalary)
        ));
        System.out.println(map);
    }


}
