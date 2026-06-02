package ExcercisesHard;

import java.util.Scanner;

public class PrimeNumber {
    //Task12: Take a number and check if it's prime or not
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number(Checking Prime): ");
        int inputNumber = scanner.nextInt();

        boolean isPrime = true;

        if (inputNumber <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
                if (inputNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime? "Prime Number." : "Not a Prime Number.");
    }
}
