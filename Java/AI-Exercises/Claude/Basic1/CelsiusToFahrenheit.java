package ExcercisesEasy;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    //Task 2: Take a temperature in Celsius and convert it to Fahrenheit
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in Celcius: ");
        double temperatureInCelcius = scanner.nextFloat();

        double temperatureInFahrenheit = temperatureInCelcius * 9.0 / 5 + 32;
        System.out.println(temperatureInFahrenheit);
    }
}
