package third;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();

        System.out.println("Enter third Number");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            System.out.println(firstNumber+ " is the largest number");
        else if (secondNumber > firstNumber && secondNumber > thirdNumber)
            System.out.println(secondNumber+ " is the largest number");
        else
            System.out.println(thirdNumber+ " is the largest number");

    }
}
