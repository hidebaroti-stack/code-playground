package ArraysAndMethods;

import java.util.Scanner;

public class MethodReverseArray {

    public static void reverseArray(int[] arr) {

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //10. Write a method reverseArray(int[] arr) that takes an array and returns the reversed
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Reverse array: ");
        reverseArray(arr);

        scanner.close();
    }

}