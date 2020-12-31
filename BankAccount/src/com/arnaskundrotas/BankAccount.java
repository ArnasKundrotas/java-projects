package com.arnaskundrotas;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private double number;

    // SET

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance (double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail (String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone (String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setNumber (double number) {
        this.number = number;
    }

    // GET

    public String getAccountNumber () {
        return accountNumber;
    }

    public double getAccountBalance () {
        return accountBalance;
    }

    public String getCustomerName () {
        return customerName;
    }

    public String getCustomerEmail () {
        return customerEmail;
    }

    public String getCustomerPhone () {
        return customerPhone;
    }

    public double addToBalance () {
        accountBalance = accountBalance + number;
        return accountBalance;
    }

    public double subtractFromBalance () {
        if (accountBalance - number > 0) {
            accountBalance = accountBalance - number;
            return accountBalance;
        }
        return -1;
    }


}
