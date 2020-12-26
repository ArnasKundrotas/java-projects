package bla.bla;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044'; // "D" Unicode
        char myUnicodeChar1 = '\u00A9'; // @ Unicode
        // single character
        // 2bytes -> 16bits -> 00000001 00000001 -> stores also unicode characters
        // 65_535 different types of characters
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeChar1);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println(myTrueBoolean);
        System.out.println(myFalseBoolean);

    }
}
