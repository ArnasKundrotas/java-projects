package com.arnaskundrotas;

public class Main {

    public static void main(String[] args) {

	    Person person = new Person();

	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("Arnas");
        person.setLastName("Kundrotas");
        person.setAge(50);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("age = " + person.getAge());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("");
        person.setLastName("Kundrotas");

        System.out.println("fullName = " + person.getFullName());

        person.setFirstName("Arnas");
        person.setLastName("Kundrotas");

        System.out.println("fullName = " + person.getFullName());

    }
}
