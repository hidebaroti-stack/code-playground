import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int findSum(int n) {
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Sum of n numbers: " + findSum(n));
    }
}