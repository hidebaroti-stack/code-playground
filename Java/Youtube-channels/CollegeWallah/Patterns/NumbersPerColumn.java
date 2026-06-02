package CollegeWallah.Patterns;

import java.util.Scanner;

public class NumbersPerColumn {

    void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        int columns = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
