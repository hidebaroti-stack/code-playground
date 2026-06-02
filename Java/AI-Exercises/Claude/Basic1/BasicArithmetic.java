package ExcercisesEasy;

import java.util.Scanner;

public class BasicArithmetic {
    //Task 1: Take two numbers as input and print their sum, difference, product, and quotient

    static void main() {

        Scanner scanner = new Scanner(System.in);
        //Input First Number
        System.out.print("Number A: ");
        int numberA = scanner.nextInt();

        System.out.print("Number B: ");
        int numberB = scanner.nextInt();

        System.out.println("Sum: " + (numberA + numberB)); //Sum
        System.out.println("Difference: " + (numberA - numberB)); //Difference
        System.out.println("Product: " + (numberA * numberB)); //Product
        System.out.println("Quotient: " + ((double)numberA / (double)numberB)); //Quotient
    }

}