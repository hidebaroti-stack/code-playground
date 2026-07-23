package BitManipulation;

import java.util.Scanner;
/**
 * FourOperations demonstrates the four fundamental bit manipulation techniques:
 * - Get Bit    : Check if a specific bit is 0 or 1
 * - Set Bit    : Force a specific bit to 1
 * - Clear Bit  : Force a specific bit to 0
 * - Toggle Bit : Flip a specific bit (0→1 or 1→0)
 *
 * Each method shows the step-by-step process with binary output so you can
 * visualize how shifting and masking affect the number.
 *
 * Note: Bit positions are zero-indexed (pos = 0 refers to the least significant bit).
 * Bit Masking: A technique of using a shifted mask (like 1 << pos) combined with bitwise operators to get, set, clear and toggle specific bits within a number.
 */
public class FourOperations {
    // Get Bit
    public static String getBit(int n, int pos) {
        /**
         *  Get Bit -> Checks whether the bit at position 'pos' is 0 or 1.
         *  Uses AND (&) with a mask (a << pos).
         *  If result is 0, bit was Zero, otherwise 1.
         */
        System.out.println("================== Get operation shown ================================");

        int bitMask = 1 << pos;

        System.out.println("Step: 1 << " + pos + " = " + Integer.toBinaryString(bitMask));
        System.out.println("Step: n & bitMask = " + Integer.toBinaryString(n & bitMask));

        System.out.println("n       : " + String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("bitMask : " + String.format("%8s", Integer.toBinaryString(bitMask)).replace(' ', '0'));
        System.out.println("Result  : " + String.format("%8s", Integer.toBinaryString(n & bitMask)).replace(' ', '0'));

        return (bitMask & n) == 0 ? "Bit was Zero" : "Bit was One.";
    }

    // Set Bit
    public static int setBit(int n, int pos) {
        /**
         *  Set Bit -> Forces the bit at position 'pos' to 1.
         *  Uses OR (|) with a mask (1 << pos).
         *  This ensures the chosen bit becomes 1 regardless of its previous value
         */
        System.out.println("================== Set operation shown ================================");

        int bitMask = 1 << pos;

        System.out.println("Step: 1 << " + pos + " = " + Integer.toBinaryString(bitMask));
        System.out.println("Step: n | bitMask = " + Integer.toBinaryString(n | bitMask));

        System.out.println("n       : " + String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("bitMask : " + String.format("%8s", Integer.toBinaryString(bitMask)).replace(' ', '0'));
        System.out.println("Result  : " + String.format("%8s", Integer.toBinaryString(n | bitMask)).replace(' ', '0'));

        return n | bitMask;
    }

    // Clear Bit
    public static int clearBit(int n, int pos) {
        /**
         *  Clear Bit -> Forces the bit a position 'pos' to 0
         *  Uses AND (&) with the inverse mask ~(1 << pos).
         *  This ensures the chosen bit becomes 0 regardless of its previous value.
         */
        System.out.println("================== Clear operation shown ================================");

        int bitMask = ~(1 << pos);

        System.out.println("Step: ~(1 << " + pos + ") = " + Integer.toBinaryString(bitMask));
        System.out.println("Step: n & bitMask = " + Integer.toBinaryString(n & bitMask));

        System.out.println("n       : " + String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("bitMask : " + String.format("%8s", Integer.toBinaryString(bitMask)).replace(' ', '0'));
        System.out.println("Result  : " + String.format("%8s", Integer.toBinaryString(n & bitMask)).replace(' ', '0'));

        return n & bitMask;
    }

    // Toggle Bit
    public static int toggleBit(int n, int pos) {
        /**
         * Toggle Bit -> Flips the bit at position 'pos'
         * Uses XOR (^) with a mask (1 << pos).
         * If bit was 0 → becomes 1; if bit was 1 → becomes 0.
         */
        System.out.println("================== Toggle operation shown ================================");

        int bitMask = 1 << pos;

        System.out.println("Step: 1 << " + pos + " = " + Integer.toBinaryString(bitMask));
        System.out.println("Step: n ^ bitMask = " + Integer.toBinaryString(n ^ bitMask));

        System.out.println("n       : " + String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("bitMask : " + String.format("%8s", Integer.toBinaryString(bitMask)).replace(' ', '0'));
        System.out.println("Result  : " + String.format("%8s", Integer.toBinaryString(n ^ bitMask)).replace(' ', '0'));

        return bitMask ^ n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Bit representation: " + Integer.toBinaryString(n));

        System.out.print("Enter bit position: ");
        int pos = scanner.nextInt();

        System.out.println("Get Bit: " + getBit(n, pos));
        System.out.println("Set Bit: " + setBit(n, pos));
        System.out.println("Clear Bit: " + clearBit(n, pos));
        System.out.println("Toggle Bit: " + toggleBit(n, pos));
    }
}