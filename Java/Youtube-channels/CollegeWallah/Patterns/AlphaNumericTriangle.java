package CollegeWallah.Patterns;

import java.util.Scanner;

public class AlphaNumericTriangle {

    void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 1) System.out.print(j + " ");
                else System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }

}
