package ExcercisesMedium;

import java.util.Scanner;

public class SimpleInterest {
    //Task 7. Calculate simple interest — SI = (P × R × T) / 100
    static void main() {

        Scanner scanner = new Scanner(System.in);

        final float PERCENT = 100F; //Constant

        System.out.print("Principal: ");
        int P = scanner.nextInt();

        System.out.print("Rate of Interest(Percent): ");
        float R = scanner.nextFloat();

        System.out.print("Time(Years): ");
        short T = scanner.nextShort();

        double SI = (P * R * T) / PERCENT;

        System.out.println("Simple Interest: " + SI);

    }
}
