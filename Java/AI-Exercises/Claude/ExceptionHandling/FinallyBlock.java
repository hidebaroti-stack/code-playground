package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero!");
        } finally {
            // always runs — good for closing resources
            System.out.println("Finally block always runs!");
        }
    }
}
/*
DRY RUN ->
try → exception thrown
catch → "Cannot divide by zero!"
finally → "Finally block always runs!" ✅ always!
 */