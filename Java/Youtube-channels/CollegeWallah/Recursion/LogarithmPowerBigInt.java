import java.math.BigInteger;
import java.util.Scanner;

public class LogarithmPowerBigInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        BigInteger a = scanner.nextBigInteger();
        System.out.print("Enter exponent: ");
        int b = scanner.nextInt();
        System.out.println(a + " raised to the pow " + b + " is: " + pow(a, b));
    }
    public static BigInteger pow(BigInteger a, int b) {
        if (b == 0) return BigInteger.ONE;
        BigInteger call = pow(a, b/2);
        if (b % 2 == 0) return call.multiply(call);
        else return  a.multiply(call).multiply(call);
    }
}
