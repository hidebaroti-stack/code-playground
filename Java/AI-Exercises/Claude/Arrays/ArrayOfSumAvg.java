package Arrays;

import java.util.Scanner;

public class ArrayOfSumAvg {
    //Create an array of 5 numbers (user input) and print the sum and average
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

        int sum = 0;
        for (int i = 0; i < 5 ; i++) {
            sum += arr[i];
        }
        System.out.printf("%nSum: " + sum);
        System.out.printf("%nAverage: " + (double)sum/ arr.length);
    }
}
