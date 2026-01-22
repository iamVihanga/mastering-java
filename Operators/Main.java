package Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isDarker;
        int hour;

        System.out.print("Is Environment Dark : ");
        isDarker = scanner.nextBoolean();

        System.out.print("Enter the hour (in 24 hours format) : ");
        hour = scanner.nextInt();

        if (isDarker && (hour > 17 || hour < 7)) {
            System.out.println("Lights on");
        } else {
            System.out.println("Lights off");
        }

        scanner.close();

        // Bitwise Operators
        int bitwiseAnd = 5 & 3;
        System.out.println(bitwiseAnd);

        int bitwiseOr = 5 | 3;
        System.out.println(bitwiseOr);

        int bitwiseXor = 5 ^ 3;
        System.out.println(bitwiseXor);

        int leftShift = 5 << 2;
        System.out.println(leftShift);
        /*
         * Explaination for left shift
         * 5 = 101
         * 2 = 10
         * 101 << 10 = 10100
         */

        int rightShift = 5 >> 2;
        System.out.println(rightShift);
        /*
         * Explaination for right shift
         * 5 = 101
         * 2 = 10
         * 101 >> 10 = 1
         */

        int unsignedRightShift = 5 >>> 2;
        System.out.println(unsignedRightShift);
        /*
         * Explaination for unsigned right shift
         * 5 = 101
         * 2 = 10
         * 101 >>> 10 = 1
         */

    }
}
