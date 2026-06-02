package Methods;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        //7. Write a method factorial(int n) that returns the factorial

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        System.out.println(factorial(userNumber));

        scanner.close();

    }
}
