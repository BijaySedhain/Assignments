package first;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit, celsius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (( celsius * 9) /5) +32;
        System.out.println("The Converted temperature in fahrenheit is "+fahrenheit);

        System.out.println();

        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (( 5 *(fahrenheit - 32)) / 9);
        System.out.println("The converted temperature in Celsius is "+celsius);
    }
}
