package ExceptionHandling.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basic {
    //Problem 1 — Basic
    //Write a program that takes two numbers from user and divides them. Handle:
    //Division by zero
    //Invalid input (user types "abc" instead of a number)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.print("Division by zero!" + e);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!" + e);
        }
    }
}