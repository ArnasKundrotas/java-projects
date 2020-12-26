package bla.bla;

public class Main {

    public static void main(String[] args) {

        // Float -> single precision number -> 32 bits -> 8x4 -> 00000001 00000001 00000001 00000001
        // Double -> double precision number -> 64 bits -> 8x8 -> 00000001 00000001 00000001 00000001 00000001 00000001 00000001 00000001

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min float number " + myMinFloatValue);
        System.out.println("Max float number " + myMaxFloatValue);
        System.out.println("Min double number " + myMinDoubleValue);
        System.out.println("max double number " + myMaxDoubleValue);

        int myIntValue = 5/3; // 1
        // float myFloatValue = 5.25; <- assumes double found float
        float myFloatValue1 = 5.25f; // f for float
        float myFloatValue2 = (float) 5.25; // casting (float) to remove error // floats are not recommended to use
        double myDoubleValue1 = 5d; // d for double

        float myFloatValue = 5f/3f; // 1.6666666
        double myDoubleValue = 5d/3d; // 1.6666_6666_6666_6667
        System.out.println("Int + float + double -> " + myIntValue + " -> " + myFloatValue + " -> " + myDoubleValue);

        double pounds = 10d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds are equal to " + kilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000_000_000.654_258_159d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        //BigDecimal precise calculation ->

    }
}
