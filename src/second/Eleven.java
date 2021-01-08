package second;

import java.util.Scanner;
// Program to swap two numbers using
// temp variable &
// without temp variable.
public class Eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        withTemp(firstNumber, secondNumber);
        withoutTemp(firstNumber, secondNumber);

    }
    public static void withTemp (int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("New value using Temporary variable: \n a = "+a + "\t b ="+b );
    }

    public static void withoutTemp (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("New value without using Temporary variable: \n a = "+a + "\t b ="+b );
        }


}
