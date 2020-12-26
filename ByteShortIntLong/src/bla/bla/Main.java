package bla.bla;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // Wrapper class of int -> Integer
        int myMaxIntValue = Integer.MAX_VALUE; // Wrapper class of int -> Integer
        System.out.println("Int Min value " + myMinIntValue);
        System.out.println("Int Max value " + myMaxIntValue);

        System.out.println("Max value " + myMaxIntValue + " + 1 -> " + (myMaxIntValue + 1) + " Overflow"); // Max value 2 147 483 647
        System.out.println("Min value " + myMinIntValue + " - 1 -> " + (myMinIntValue - 1) + " Underflow"); // Min value -2 147 483 648

        // int myMaxIntTest = -2_147_483_649; // error; integer number too large

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value " + myMinByteValue); // Min value -128
        System.out.println("Byte Max value " + myMaxByteValue); // Max value 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min value " + myMinShortValue); // Min value -32_768
        System.out.println("Short Max value " + myMaxShortValue); // Max value 32_767

        long myMinLongtValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Short Min value " + myMinLongtValue); // Min value -9_223_372_036_854_775_808
        System.out.println("Short Max value " + myMaxLongValue); // Max value 9_223_372_036_854_775_807

        // Byte -> 8 bits -> 00000001
        // Short -> 16 bits -> 8x2 -> 00000001 00000001
        // Integer -> 32 bits -> 8x4 -> 00000001 00000001 00000001 00000001
        // Long -> 64 bits -> 8x8 -> 00000001 00000001 00000001 00000001 00000001 00000001 00000001 00000001

        int myTotal = (myMinIntValue / 2);

        // Java by default use integer if no cast // most of the time use integer
        byte myNewByteValue = (byte)(myMinByteValue / 2); // casting
        short myNewShortValue = (short)(myMinShortValue / 2); // casting

        byte myOtherByteNumber = 125;
        short myOtherShortNumber = 31_000;
        int myOtherIntNumber = 1_000_000;
        long myOtherLongNumber= 50000L + 10L * (myOtherByteNumber + myOtherShortNumber + myOtherIntNumber);
        System.out.println(myOtherLongNumber);
    }
}
