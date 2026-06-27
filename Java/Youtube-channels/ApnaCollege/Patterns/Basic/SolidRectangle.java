package Patterns.Basic;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = scanner.nextInt();

        System.out.print("Enter the columns: ");
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}