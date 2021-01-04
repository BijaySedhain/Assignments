package first;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the two number is " +sum );

        int average = sum/2;

        System.out.println("The Average of the two number is " +average);

    }
}
