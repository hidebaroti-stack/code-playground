package ExceptionHandling;

public class ThrowAndThrows {
    // throws declares that this method might throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!"); // manually throw
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
/*
 The difference:

     throw
     -----
     What: Actually throws an exception
     Where: Inside method body
     Example: throw new Exception();

     throws
     ------
     What: Declares a method might throw
     Where: In method signature
     Example: void method() throws Exception
 */