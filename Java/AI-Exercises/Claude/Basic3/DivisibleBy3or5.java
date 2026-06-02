package ExcercisesHard;

public class DivisibleBy3or5 {
    //Task9: Print all numbers from 1 to 100 that are divisible by 3 or 5
    static void main() {

        System.out.print("The Numbers divisible by 3 or 5 (1 to 100): ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i == 100) {
                    System.out.print(i + ".");
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}

