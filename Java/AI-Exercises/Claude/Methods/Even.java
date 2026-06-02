package Methods;

import java.util.Scanner;

public class Even {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        //6. Write a method isEven(int number) that returns true/false and print the result
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        System.out.println(isEven(userNumber));
        scanner.close();
    }
}