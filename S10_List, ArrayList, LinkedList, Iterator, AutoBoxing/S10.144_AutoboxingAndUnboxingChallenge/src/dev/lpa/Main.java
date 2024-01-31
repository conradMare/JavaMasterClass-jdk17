package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob S", 1000.00);
        System.out.println(bob);
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {

        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }
}