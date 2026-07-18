import java.util.Scanner;

public class ReverseNumber_Void {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        reverse(number, 0);
    }
    public static void reverse(int n, int r) {
        if (n == 0) {
            System.out.println(r);
            return;
        }
        reverse(n/10, r * 10 + n % 10);
    }
}