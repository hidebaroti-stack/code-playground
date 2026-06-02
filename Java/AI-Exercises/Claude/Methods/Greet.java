package Methods;

import java.util.Scanner;

public class Greet {

    public static void greet(String name) {
        System.out.println("Hello, " + name + " Welcome.");
    }
    public static void main(String[] args) {
        //5. Write a method greet(String name) that prints "Hello, [name]! Welcome."
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        greet(userName);
        scanner.close();
    }
}