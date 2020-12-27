package bla.bla;

public class Main {

    public static void main(String[] args) {


        // Strings are not mutable
        // Old string is discarded and new is created
        String myString = "my string"; // not a primitive type
        // Technically limited by memory or int max_value -> 2.14 billion
        System.out.println(myString);
        myString = myString + " added lines";
        System.out.println(myString);
        myString = myString + " \u00A9 2200";
        System.out.println(myString);


    }
}
