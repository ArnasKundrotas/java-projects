package bla.bla;

public class Main {

    public static void main(String[] args) {
	    // Operand -> object manipulated by an operand
        /* int myVar = 15 + 12
            - -> + is operator
            - 15 and 12 -> operands
            - Variables -> operands also
        */

        // Expression -> variables + literals + method return values + operators

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResult = result;
        System.out.println(previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println(result);

        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(result);

        result = result % 3; // 4 % 3 = 1 4 / 3 -> 1.3333333(3)
        System.out.println(result);

        result++;
        System.out.println(result); // 1 + 1 =2
        result--;
        System.out.println(result); // 2 - 1 = 1
        result += 2;
        System.out.println(result); // 1 + 2 = 3
        result *= 5;
        System.out.println(result); // 3 * 5 = 15;
        result /= 2;
        System.out.println(result); // 15 / 2 = 7
        result -= 2;
        System.out.println(result); // 7 - 2 = 5

    }
}
