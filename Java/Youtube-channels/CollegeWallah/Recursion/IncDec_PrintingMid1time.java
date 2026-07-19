import java.util.Scanner;

public class IncDec_PrintingMid1time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        int n = scanner.nextInt();
        print(n);
    }

    public static void print(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }
}