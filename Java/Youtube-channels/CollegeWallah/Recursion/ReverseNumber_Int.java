import java.util.Scanner;

public class ReverseNumber_Int {
    public static int reverse(int n, int r) {
        if (n == 0) return r;
        return reverse(n / 10, r*10 + (n % 10));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.println("Reverse number: " + reverse(n, 0));
    }
}