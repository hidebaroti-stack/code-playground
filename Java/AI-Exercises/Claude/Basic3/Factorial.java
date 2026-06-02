package ExcercisesHard;

import java.util.Scanner;

public class Factorial {
    //Task10: Take a number and find its factorial
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        System.out.print("Factorial of the number " + number + " is: ");

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.print(fact);
    }
}
