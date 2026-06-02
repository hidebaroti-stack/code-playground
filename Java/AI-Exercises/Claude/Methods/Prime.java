package Methods;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //8. Write a method isPrime(int n) that returns true/false
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int userNumber = scanner.nextInt();

        System.out.println(isPrime(userNumber));
        scanner.close();
    }
}
