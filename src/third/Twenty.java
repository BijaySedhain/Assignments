package third;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the desired operator.");
        char ch = input.next().charAt(0);

        System.out.println("Enter First number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();

        if (ch == '+') {
            Addition(firstNumber, secondNumber);
        } else if (ch == '-') {
            Subtract(firstNumber, secondNumber);

        } else if (ch == '*') {
            Multiply(firstNumber, secondNumber);
        } else if (ch == '/') {
            Division(firstNumber,secondNumber);
        }


    }
    public static void Addition (int a , int b) {
        int c = a+b;
        System.out.println("Answer is "+c);
    }

    public static void Subtract (int a , int b) {
        int c = a-b;
        System.out.println("Answer is "+c);
    }

    public static void Multiply (int a , int b) {
        int c = a*b;
        System.out.println("Answer is "+c);
    }

    public static void Division (int a , int b) {
        int c = a / b;
        System.out.println("Answer is "+c);
    }
}
