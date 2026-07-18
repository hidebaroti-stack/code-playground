import java.util.Scanner;

public class XtoN {
    static int n; //Global declaration for n BUT not preferable
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int x = scanner.nextInt();
        print(x);
    }
    public static void print(int x) {
        if (x > n) return;
        System.out.print(x + " ");
        print(x + 1);
    }
}