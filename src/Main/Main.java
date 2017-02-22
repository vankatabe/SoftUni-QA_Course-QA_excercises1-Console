package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Problem 6
        String name = "Pesho";
        int age = 28;
        double height = 1.84;

        // Problem 7
        System.out.println("My name is " + name + '.');
        System.out.println();

        // Problem 8
        int x = 1736436;
        int y = 48923416;
        int result = x + y;
        System.out.println("The result is " + result);
        System.out.println();

        // Problem 9
        // Print on the console the current date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime currentdate = LocalDateTime.now();
        System.out.println("The current date is: " + dtf.format(currentdate));
        System.out.println();

        // Print on the console the date after 20 hours
        LocalDateTime laterdate = currentdate.plusHours(20);
        System.out.println("The date after 20 hours is: " + dtf.format(laterdate));
        System.out.println();

        // Print on the console the product of two “double” variables declared by you
        double d1 = 25.46;
        double d2 = 156.234;
        double sum = d1 + d2;
        System.out.println("25.46 + 156.234 = " + sum); //Strangely enough it prints "00000000002" at the end of the result?!
        System.out.println("\"The discovery of floating point arithmetic marks an important milestone in every programmer's life. Congratulations. :) – Adam Paynter Aug 1 '11 at 17:41\"");
        System.out.println();

        // Read from the console an user input which should be numeric. Sum it with 10 and print on the console the sum.
        Scanner console = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int number = Integer.parseInt(console.nextLine());
        int numberPlusTen = number + 10;
        System.out.println(number + " + 10 = " + numberPlusTen);
        System.out.println();

        // Read from the console two numbers. Print on the console their product (e.g. Read “4” and “20”, Print “80”)
        // Scanner console = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int n1 = Integer.parseInt(console.nextLine());
        System.out.print("Type a second integer: ");
        int n2 = Integer.parseInt(console.nextLine());
        int nProduct = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + nProduct);
        System.out.println();

        // Print on the console the numbers from 1 to 1000. You may need to use loops.
        System.out.print("Do you want to get the numbers from 1 to 1000? (y/n)");
        char yes = console.next().charAt(0);
        if ((yes == 'y')) for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
