package Arrays;

import java.util.Scanner;

public class ArrayOfReverseOrder {
    //Take an array of numbers and print them in reverse order
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
        System.out.printf("%nReverse Order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
