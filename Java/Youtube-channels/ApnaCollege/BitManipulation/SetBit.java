package BitManipulation;

import java.util.Scanner;

public class SetBit {
    // Set Bit -> Set the nth bit of a number n.
    // Bit Mask: 1 << i (pos)
    // Operation: OR
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Bit representation of n: " + Integer.toBinaryString(n));

        System.out.print("Enter bit position: ");
        int pos = scanner.nextInt();

        int bitMask = 1 << pos;

        int newNumber = bitMask | n;

        System.out.println("New number: " + newNumber);
        System.out.println("Bit representation of new number: " + Integer.toBinaryString(newNumber));
    }
}
