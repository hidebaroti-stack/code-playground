package CollegeWallah.Patterns;

import java.util.Scanner;

public class StarTriangleFlipped {

    void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= rows-1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
