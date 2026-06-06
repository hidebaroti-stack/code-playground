import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        byte userAge = scanner.nextByte();
        System.out.println("Your age: " + userAge);

        scanner.nextLine(); // consume leftover newline

        System.out.print("Name: ");
        String username = scanner.nextLine().trim();
        System.out.println("Your name: " + username);

    }
}