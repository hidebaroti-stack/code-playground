package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
/*
DRY RUN ->
try block → 10/0 → ArithmeticException thrown!
catch block → "Cannot divide by zero!"
             "Error: / by zero"
"Program continues..." → still prints ✅
 */