package ExceptionHandling;

// Create own exception by extending Exception
class InvalidAgeException extends Exception {
    // Constructor passes message to parent
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age); // throw custom exception
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
/*
DRY RUN ->
validateAge(200) → 200 > 150 → throw InvalidAgeException
catch → "Caught: Invalid age: 200"
 */