package ExcercisesEasy;

import java.util.Scanner;

public class PerimeterRectangle {
    //Task 4: Calculate the area and perimeter of a rectangle using length and width input

    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Length of a Rectangle: ");
        float length = scanner.nextFloat();

        System.out.print("Input Width of a Rectangle: ");
        float width = scanner.nextFloat();

        float area = length * width;
        float perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
