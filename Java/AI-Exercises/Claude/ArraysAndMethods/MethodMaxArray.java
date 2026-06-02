package ArraysAndMethods;

import java.util.Scanner;

public class MethodMaxArray {

    public static int getMax(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        //9. Write a method getMax(int[] arr) that takes an array and returns the largest number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
            System.out.println(getMax(arr));
            scanner.close();
    }
}
