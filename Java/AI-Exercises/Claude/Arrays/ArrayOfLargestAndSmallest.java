package Arrays;

import java.util.Scanner;

public class ArrayOfLargestAndSmallest {
    //Create an array of 5 numbers and find the largest and smallest value
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter the element of the Array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("The elements of the Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        int largest = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        System.out.printf("%nLargest element: " + largest);
        int smallest = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }
        System.out.printf("%nSmallest element: " + smallest);
    }
}
