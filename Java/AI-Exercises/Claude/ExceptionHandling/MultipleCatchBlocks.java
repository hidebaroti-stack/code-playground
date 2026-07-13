package ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0;       // ArithmeticException (never reached)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist!");
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero!");
        }
    }
}
/*
DRY RUN ->
arr[5] → throws ArrayIndexOutOfBoundsException
first catch matches → "Index does not exist!"
second catch → never reached
 */