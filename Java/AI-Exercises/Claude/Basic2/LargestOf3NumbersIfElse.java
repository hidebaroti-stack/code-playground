package ExcercisesMedium;

import java.util.Scanner;

public class LargestOf3NumbersIfElse {
    //Task 5: Take 3 numbers and find the largest one
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Number3: ");
        int number3 = scanner.nextInt();

        if(number1 >= number2 && number1 >= number3) {
            System.out.println("Number 1 is the largest.");
        }else if (number2 >= number1 && number2 >= number3){
            System.out.println("Number 2 is the largest.");
        }else
            System.out.println("Number 3 is the largest.");
    }
}