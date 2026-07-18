import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println(factorialPrint(n));
    }
    public static int factorialPrint(int n) {
        if (n == 0) return 1;
        return n * factorialPrint(n - 1);
    }
}