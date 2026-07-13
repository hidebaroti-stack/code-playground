package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // throws if user type "abc"
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("That was not a valid number!");
        } finally {
            scanner.close();
        }
    }
}