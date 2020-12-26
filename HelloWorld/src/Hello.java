public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I'm Arnas");

        int myFirstNumber = 5 + 5;
        System.out.println("My First Number " + myFirstNumber);

        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int sum = mySecondNumber + myThirdNumber;
        System.out.println("My sum of two numbers " + sum);

        // Java converts numbers to strings
        String myFirstString = "abc";
        String converted = mySecondNumber + myThirdNumber + myFirstString;
        System.out.println("My sum of two numbers and string converted " + converted);

        int myLastOne = sum - 1000;
        System.out.println(myLastOne);

    }
}

