package Variables;

public class Main {
    public static void main(String[] args) {

        // Premitive Data Types
        int age = 40;
        int year = 2026;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temprature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean online = true;

        System.out.println("Age is " + age);
        System.out.println("The year is : " + year);

        System.out.println(currency + "" + price);
        System.out.println("GPA is : " + gpa);
        System.out.println("Temperature is : " + temprature);

        System.out.println("Is student : " + isStudent);
        System.out.println("For sale : " + forSale);
        System.out.println("Online : " + online);

        if (isStudent) {
            System.out.println("You can get a student discount");
        } else {
            System.out.println("You can't get a student discount");
        }

        // Reference Data Types
        String name = "John Winchester";
        String city = "Kansas City";
        String food = "pizza";

        System.out.println("Hello " + name + " from " + city);
        System.out.println("Your favorite food is " + food);

    };
};