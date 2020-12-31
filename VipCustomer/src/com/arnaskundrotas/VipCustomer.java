package com.arnaskundrotas;

public class VipCustomer {

    // FIELDS

    private String name;
    private double creditLimit;
    private String emailAddress;

    // CONSTRUCTORS

    public VipCustomer() {
        this ("Default name", 200000, "arnas.kundrotas@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // GETTERS

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
