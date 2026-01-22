package Arithmatics;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;

        // addition
        z = x + y;
        System.out.println("x + y = " + z);

        // substraction
        z = x - y;
        System.out.println("x - y = " + z);

        // multiplication
        z = x * y;
        System.out.println("x * y = " + z);

        // division
        z = x / y;
        System.out.println("x / y = " + z);

        // remainder
        z = x % y;
        System.out.println("x % y = " + z);

        // Math Class
        System.out.println("Value of Pi: " + Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5);
        System.out.println(result);

        result = Math.sqrt(16);
        System.out.println(result);

        result = Math.abs(-10);
        System.out.println(result);

        result = Math.ceil(3.14);
        System.out.println(result);

        result = Math.floor(3.14);
        System.out.println(result);

    }
}
