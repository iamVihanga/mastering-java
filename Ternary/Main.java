package Ternary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 77;

        String result = score >= 60 ? "Pass" : "Fail";

        System.out.println("Your score is " + score + " and you are " + result);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter random number : ");
        int random = scanner.nextInt();

        String status = (random % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + status);

        scanner.close();

    }
}
