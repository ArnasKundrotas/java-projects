package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

	    bankAccount.setAccountNumber("LT1000012454646");
	    bankAccount.setAccountBalance(1);
	    bankAccount.setCustomerName("Arnas Kundrotas");
	    bankAccount.setCustomerEmail("arnas.kundrotas@gmail.com");
	    bankAccount.setCustomerPhone("+37068721370");
	    bankAccount.setNumber(200);

        System.out.println("Acount number = " + bankAccount.getAccountNumber());
        System.out.println("Balance = " + bankAccount.getAccountBalance());
        System.out.println("Customer Name = " + bankAccount.getCustomerName());
        System.out.println("Customer Email = " + bankAccount.getCustomerEmail());
        System.out.println("Customer Phone = " + bankAccount.getCustomerPhone());

        System.out.println("Withdraw 200 from account = " + bankAccount.subtractFromBalance());
        System.out.println("Add to the account balance 200 = " + bankAccount.addToBalance());
        System.out.println("Withdraw 200 from account = " + bankAccount.subtractFromBalance());

    }
}
