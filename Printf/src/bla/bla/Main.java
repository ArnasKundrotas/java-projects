package bla.bla;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        System.out.printf("%d", 10); // d -> integer -> 10
        System.out.printf("%f", 10.1); // f -> float -> 10.100_000
        System.out.printf("%c", 'a'); // c -> character -> a
        System.out.printf("%C", 'a'); // C -> Uppercase the character -> A
        System.out.printf("%s", "hello"); // s -> String -> hello
        System.out.printf("%S", "hello"); // S -> Uppercase the string -> HELLO
        System.out.printf("%b", 5 < 4); // b -> Boolean -> false
        System.out.printf("%B", "hello"); // B -> Uppercase the Boolean -> FALSE
        System.out.printf("%b", null); // b -> Boolean -> false
        System.out.printf("%b", "cow"); // b -> Boolean -> true
        System.out.printf("%e", 10.123); // e -> 1.012300e+01
        System.out.printf("%E", 10.123); // E -> 1.012300E+01
        System.out.printf("%g", 10_000.0); // g -> 10000.0
        System.out.printf("%G", 10_000_000.0); // G -> 1.012300E+07
        System.out.printf("%o", 10); // o -> octal -> 12
        System.out.printf("%x", 10); // x -> hex -> a
        System.out.printf("%X", 10); // X -> hex -> A
        System.out.printf("%h", "hello"); // h -> hashcode -> 5e918d2
        System.out.printf("%H", "hello"); // H -> hashcode -> 5E918d2
        System.out.printf("%a", 10.12); // a -> hex float val -> 0x1.43d70a3d70a3dp3
        System.out.printf("%A", 10.12); // A -> uppercase the hex float val -> 0x1.43D70A3D70A3DP3

        Calendar cal = Calendar.getInstance(); // %t
        System.out.printf("%tB", cal); // current month -> December
        System.out.printf("%TB", cal); // uppercase the current month -> DECEMBER
        System.out.printf("%n"); // new line
        System.out.printf("%%", cal); // %

        int num1 = 10;
        int num2 = 30;
        System.out.printf("%d %d% d%n", num1, 20, num2); // 10 20 30

        int num3 = 87;
        char per = '%';
        String s = " of all statistics are made up?";
        System.out.printf("Did you know, %d%c%s%n", num3, per, s); // Did you know, 87% of all statistics are made up?
        System.out.printf("Did you know, %d%%%s%n", num3, s); // Did you know, 87% of all statistics are made up?

        String name = "Sally";
        int age = 18;
        double gpa = 3.5;
        System.out.printf("Name: %s%n Age: %d%n GPA: %f%n", name, age, gpa);
        /*
        Name: Sally
         Age:18
         GPA: 3.500000
         */

        // %[argument_index$][flags][width][.precision]f
        // .precision
        double num4 = 12.3456789d;
        System.out.printf("%f%n", num4); // 10.123400 -> default 6 decimal places
        System.out.printf("%.0f%n", num4); // 12
        System.out.printf("%.1f%n", num4); // 12.3
        System.out.printf("%.2f%n", num4); // 12.35
        System.out.printf("%.3f%n", num4); // 12.346
        System.out.printf("%.4f%n", num4); // 12.3457
        System.out.printf("%.5f%n", num4); // 12.34568
        System.out.printf("%.6f%n", num4); // 12.345679
        System.out.printf("%.7f%n", num4); // 12.3456789
        System.out.printf("%.8f%n", num4); // 12.34567890

        String str = "hello";
        int num5 = 15;
        char let1 = 'A';
        System.out.printf("%.2s%n", str); // he
        System.out.printf("%.3b%n", true); // tru
        System.out.printf("%.2h%n", str); // 5e
        // System.out.printf("%.3d%n", num5); // error
        // System.out.printf("%.2c%n", let1); // error
        // System.out.printf("%.3n", num5); // error

        // [width]
        System.out.printf("%8d%n", 123); // _____123
        System.out.printf("%4d%5d%n", 123, 456); // _123__456
        System.out.printf("%4d%n", 12345); // 123456 // -> width minimum number of characters
        System.out.printf("%6.2f%n", 123.45); // 123.45 -> . = _

        // [flags]
            // {-}
        System.out.printf("%-8d%n", 123); // 123_____
        System.out.printf("%-6s%5d%n", "num =", 456); // num_=___456

        String name1 = "Albert";
        int age1 = 18;
        double gpa1 = 3.5;
        System.out.printf("%-7s%7s%n", "Name =", name);     // Name_=__Albert
        System.out.printf("%-7s%7d%n", "Age =", age);       // Age_=_______18
        System.out.printf("%-7s%7.2f%n", "GPA =", gpa);     // GPA_=_____3.50
        // System.out.printf("%6n"); // error

            // {+} -> %d %o %x %X %e %E %f %g %G %a %A
        System.out.printf("%+d%n", 123); // +123
        System.out.printf("%+d%n", -123); // -123
        System.out.printf("%+.2f%n", 123.12); // +123.12
        System.out.printf("%+.2f%n", -123.12); // -123.12

            // { } -> %d %o %x %X %e %E %f %g %G %a %A
        System.out.printf("% d%n", 123); // _123
        System.out.printf("% d%n", -123); // -123
        System.out.printf("% .2f%n", 123.12); // _123.12
        System.out.printf("% .2f%n", -123.12); // -123.12
        // System.out.printf("% +.2f%n", -123.12); // error

            // {0} -> %d %o %x %X %e %E %f %g %G %a %A
        // System.out.printf("%0d%n", 123); // error -> must always specify width
        System.out.printf("%06d%n", -123); // -00123
        System.out.printf("%07.2f%n", 123.12); // 0123.12
        // System.out.printf("%-07d%n", -123); // error

            // {,} -> %d %e %E %f %g %G
        System.out.printf("%,d%n", 123); // 123
        System.out.printf("%,d%n", -1234); // -1,234
        System.out.printf("%,.2f%n", 1234.12); // 1,234.12
        // System.out.printf("%,o%n", -123.12); // error
        System.out.printf("%,08d%n", 123456); // 0123,456
        System.out.printf("%,015d%n", 12345); // 00000000012,345

            // {(} -> %d %o %x %X %e %E %f %g %G
        System.out.printf("%(d%n", 123); // 123
        System.out.printf("%(d%n", -1234); // (1234)
        System.out.printf("%(.2f%n", 1234.12); // 1234.12
        // System.out.printf("%(a%n", -123.12); // error
        System.out.printf("%(08d%n", -12345); //  (012345)

            // {#} -> %o %x %X %e %E %f %a %A
        System.out.printf("%#o%n", 123); // 0173
        System.out.printf("%#x%n", 1234); // 0x4d2
        System.out.printf("%#X%n", 1234); // 0X4D2
        System.out.printf("%#08x%n", 1234); // 0x0004d2

        System.out.printf("%.0f%n", 12.34); // 12
        System.out.printf("%#.0f%n", 12.34); // 12.
        System.out.printf("%.0e%n", 12.34); // 1e+01
        System.out.printf("%#.0e%n", 12.34); // 1.e+01
        System.out.printf("%#08.0f%n", 12.34); // 0000012.
        System.out.printf("%#08.0e%n", 12.34); // 001.e+01
        System.out.printf("%#a%n", 12.34); // 0x1.8ae147ae147aep3

        // [argument_index]
        System.out.printf("%s %s %s%n", "1", "2", "3");         // 1 2 3
        System.out.printf("%1$s %1$s %1$s%n", "1", "2", "3");   // 1 1 1
        System.out.printf("%3$s %2$s %1$s%n", "1", "2", "3");   // 3 2 1
        System.out.printf("%2$s %s %s%n", "1", "2", "3");       // 2 1 2
        System.out.printf("%s %3$s %s%n", "1","2", "3");        // 1 3 2
        System.out.printf("%2$s %3$s %s%n", "1", "2", "3");     // 2 3 1
        System.out.printf("%1$s %1$s%n", "1");                  // 1 1

        System.out.printf("%s %<s %<s%n", "1", "2", "3");       // 1 1 1
        System.out.printf("%s %<s %s%n", "1", "2", "3");        // 1 1 2
        System.out.printf("%s %s %<s%n", "1", "2", "3");        // 1 2 2
        // System.out.printf("%<s %s %s%n", "1", "2", "3");     // error
        // System.out.printf("%$2s %s %<s%n", "1", "2", "3");   // error
        System.out.printf("%2$s %s %<s%n", "1", "2", "3");      // 2 1 1


    }
}
