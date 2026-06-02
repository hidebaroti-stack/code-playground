package CollegeWallah.Patterns;

import java.util.Scanner;

public class NumberRightTrianglePerRow {

    void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
