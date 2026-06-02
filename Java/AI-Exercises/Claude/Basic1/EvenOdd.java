package ExcercisesEasy;

import java.util.Scanner;

public class EvenOdd {
    //Task 3: Take a number and check if it's even or odd
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number(Even / Odd): ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is Odd.");
    }
}
