import java.util.Scanner;

public class LowerLimit_to_UpperLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter upper limit: ");
        int upperLimit = scanner.nextInt();

        print(lowerLimit, upperLimit);
    }
    public static void print(int lowerLimit,int upperLimit) {
        if (lowerLimit > upperLimit) return;
        System.out.println(lowerLimit);
        print(lowerLimit + 1, upperLimit);
    }
}