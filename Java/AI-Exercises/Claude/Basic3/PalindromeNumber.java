package ExcercisesHard;

import java.util.Scanner;

public class PalindromeNumber {
    //Task11: Check if a number is a palindrome (e.g. 121 → yes, 123 → no)
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number(Checking Palindrome): ");
        int userNumber = scanner.nextInt();

        int toCheck = userNumber;
        int reverse = 0;
        int digit;

        while (userNumber != 0) {
            digit = userNumber % 10;
            reverse = reverse * 10 + digit;
            userNumber /= 10;
        }

        if (reverse == toCheck) {
            System.out.println("Palindrome Number.");
        } else {
            System.out.println("Not a Palindrome Number.");
        }

    }
}
