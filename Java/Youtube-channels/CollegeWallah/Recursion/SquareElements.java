import java.util.Scanner;

public class SquareElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        squarePrint(n);
    }
    public static void squarePrint(int n) {
        if ( n == 0) return;
        squarePrint(n - 1);
        System.out.println(n*n);
    }
}