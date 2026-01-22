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

    }
}
