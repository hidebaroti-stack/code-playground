package BitManipulation;

import java.util.Scanner;

public class GetBit {
    // Get Bit -> Get the nth position bit of a number n
    // Bit Mask: 1 << i (pos)
    // Operation: AND
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Enter bit position: ");
        int pos = scanner.nextInt();

        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) System.out.println("Bit was Zero.");
        else System.out.println("Bit was One.");

        System.out.println("Binary representation: " + Integer.toBinaryString(n));
    }
}