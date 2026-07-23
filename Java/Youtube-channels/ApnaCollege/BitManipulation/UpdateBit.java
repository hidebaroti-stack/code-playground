package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Enter bit position: ");
        int pos = scanner.nextInt();

        System.out.print("Enter an operation to perform(1 = set / 0 = clear): ");
        int oper = scanner.nextInt();

        int bitMask = 1 << pos;

        switch (oper) {
            case 1: // Set bit
                int newNumber1 = n | bitMask;
                System.out.println("New number: " + newNumber1);
                break;
            case 0: // Clear bit
                int notBitMask = ~(bitMask);
                int newNumber2 = n & notBitMask;
                System.out.println("New number: " + newNumber2);
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}