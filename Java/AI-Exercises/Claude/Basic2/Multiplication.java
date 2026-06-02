package ExcercisesMedium;

import java.util.Scanner;

public class Multiplication {
    //Task 6. Take a number and print its multiplication table (1 to 10)
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Multiplication of " + number + ", " + number + "x" + i + "=" + (number * i) + ".");
        }
    }
}
