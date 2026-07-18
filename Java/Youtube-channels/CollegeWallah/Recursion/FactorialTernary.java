import java.util.Scanner;
public class FactorialTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
}