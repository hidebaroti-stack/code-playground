import java.util.Scanner;

public class LogarithmPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int b = scanner.nextInt();
        System.out.println(a + " raised to the pow " + b + " is: " + pow(a, b));
    }
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        int call = pow(a, b/2);
        if (b % 2 == 0) return call * call;
        else return a * call * call;
    }
}