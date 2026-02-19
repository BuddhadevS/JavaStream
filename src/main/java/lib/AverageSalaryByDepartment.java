package lib;

import java.util.*;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("A", "HR", 40000),
                new Employee("B", "HR", 50000),
                new Employee("C", "DEV", 70000),
                new Employee("D", "DEV", 80000),
                new Employee("E", "QA", 55000)
        );

        // Average salary per department
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        // Department with highest average salary
        Map.Entry<String, Double> highestAvgDept =
                avgSalaryByDept.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get();

        // Output
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg));

        System.out.println(
                "Highest average salary department: "
                        + highestAvgDept.getKey()
                        + " = " + highestAvgDept.getValue()
        );
    }
}

