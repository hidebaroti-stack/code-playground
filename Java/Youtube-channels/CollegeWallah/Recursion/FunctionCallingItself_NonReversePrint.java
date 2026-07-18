import java.util.Scanner;

public class FunctionCallingItself_NonReversePrint {
    //Print 1 to x
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'n' number to print: ");
        int n = scanner.nextInt();
        print(n);
    }
    public static void print(int n) {
        if (n == 0) return; //will print 5 times, 1 2 3 4 5
        print(n - 1);
        System.out.println(n);
    }
}
