package BitManipulation;

import java.util.Scanner;

public class ClearBit {
    // Clear the nth bit of a number n;
    // Bit mask : 1 << i
    // Operation: AND with NOT
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Enter bit position: ");
        int pos = scanner.nextInt();

        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;

        System.out.println("New number: " + newNumber);
    }
}