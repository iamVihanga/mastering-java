package UserInputs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.next();

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", You are " + age + " years old");

        System.out.println("What is your GPA ? ");
        double gpa = scanner.nextDouble();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + gpa);

        scanner.close();
    }
}
