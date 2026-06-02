package ExcercisesMedium;

import java.util.Scanner;

public class LargestOf3Numbers {
    //Task 5: Take 3 numbers and find the largest one
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Number3: ");
        int number3 = scanner.nextInt();

        int largest = Math.max(number1, Math.max(number2, number3));
        System.out.println("The Largest Number: " + largest);
    }
}