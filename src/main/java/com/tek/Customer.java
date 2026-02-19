package com.tek;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class Customer {

    private String id;
    private String name;
    private String country;
    private int age;
    private int yearOfMembership;
    private double balance;
    private int loyaltyScore;
    private int numberOfTransactions;

    public Customer(String id, String name, String country, int age, int yearOfMembership,
                    double balance, int loyaltyScore, int numberOfTransactions) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
        this.yearOfMembership = yearOfMembership;
        this.balance = balance;
        this.loyaltyScore = loyaltyScore;
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCountry() { return country; }
    public int getYearOfMembership() { return yearOfMembership; }
    public double getBalance() { return balance; }
    public int getLoyaltyScore() { return loyaltyScore; }
    public int getNumberOfTransactions() { return numberOfTransactions; }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", yearOfMembership=" + yearOfMembership +
                ", balance=" + balance +
                ", loyaltyScore=" + loyaltyScore +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }

    public static void main(String[] args) {

        Map<String, Customer> customerMap = Map.of(
                "1", new Customer("1", "John", "India", 28, 2024, 500.50, 120, 30),
                "2", new Customer("2", "Alex", "USA", 45, 2015, 200000.00, 300, 120),
                "3", new Customer("3", "Sita", "India", 32, 2020, 15000.00, 80, 12),
                "4", new Customer("4", "Maria", "UK", 39, 2012, 98000.75, 250, 80),
                "5", new Customer("5", "Ravi", "India", 25, 2022, 22000.00, 60, 10)
        );

        int currentYear = Year.now().getValue();

        List<Customer> filtered = customerMap.values().stream()
                .filter(c -> (currentYear - c.getYearOfMembership()) < 2)
                .filter(c -> c.getBalance() < 1000)
                .filter(c -> c.getNumberOfTransactions() > 10)
                .toList();

        System.out.println(" Filtered Customers:");
        filtered.forEach(System.out::println);

        List<Customer> sortedDesc = filtered.stream()
                .sorted(Comparator.comparing(Customer::getLoyaltyScore).reversed())
                .toList();


        System.out.println("names & loyalty  in ascending order:");
        sortedDesc.stream()
                .sorted(Comparator.comparing(Customer::getLoyaltyScore))
                .forEach(c -> System.out.println(c.getName() + " -> " + c.getLoyaltyScore()));

        Map<String, String> resultMap = sortedDesc.stream()
                .collect(Collectors.toMap(
                        Customer::getId,
                        c -> new StringBuilder(c.getName()).reverse().toString().toLowerCase()
                                + "===>" + c.getCountry().toLowerCase()
                ));

        System.out.println(" Result Map:");
        System.out.println(resultMap);
    }
}
