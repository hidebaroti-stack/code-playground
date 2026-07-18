import java.util.Scanner;

public class FunctionCallingItself_ReversePrint {
    //Print n to 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'n' number to print: ");
        int n = scanner.nextInt();
        print(n);
    }
    public static void print(int n) {
        if (n == 0) return; //will print 5 times, 5 4 3 2 2 1
        System.out.println(n);
        print(n - 1);
    }
}