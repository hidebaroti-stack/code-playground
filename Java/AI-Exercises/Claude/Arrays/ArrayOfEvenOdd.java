package Arrays;

import java.util.Scanner;

public class ArrayOfEvenOdd {
    //Count how many numbers in an array are even and how many are odd
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the element of the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("The elements of the Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.printf("%nEven elements: " + countEven);

        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.printf("%nOdd elements: " + countOdd);
    }
}
