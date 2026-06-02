package ExcercisesMedium;

import java.util.Scanner;

public class PositiveNegativeZero {
    //task 8. Take a number and check if it's positive, negative, or zero
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int userNumber = scanner.nextInt();

        if(userNumber > 0) System.out.println("Positive Number.");
        else if (userNumber < 0) System.out.println("Negative Number.");
        else System.out.println("The number is a Zero.");

    }
}
