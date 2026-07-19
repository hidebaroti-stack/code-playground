import java.util.Scanner;

public class IncDec_PrintingMid1time_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 'n': ");
        int n = scanner.nextInt();
        print(n);
    }

    public static void print(int n) {
        if(n == 0) return;                  // Base case
        System.out.println(n);              // Print before Recursive call
        print(n - 1);                       // Recursive call
        if (n != 1) System.out.println(n);  // Print after Recursive call while skipping for 1
    }
}