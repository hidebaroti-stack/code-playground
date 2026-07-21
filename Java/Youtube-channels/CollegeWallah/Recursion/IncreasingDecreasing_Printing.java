import java.util.Scanner;

public class IncreasingDecreasing_Printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        int n = scanner.nextInt();
        print(n);
    }

    public static void print(int n) {
        if(n == 0) return;
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }
}