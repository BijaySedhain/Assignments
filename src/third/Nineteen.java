package third;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side");
        int firstSide = input.nextInt();

        System.out.println("Enter the second side");
        int secondSide = input.nextInt();

        System.out.println("Enter the third Side");
        int thirdSide = input.nextInt();

        if (firstSide == secondSide && firstSide == thirdSide) {

            System.out.println("It is a Equilateral triangle.");
        }
        if ((firstSide == secondSide && secondSide != thirdSide) || (secondSide == thirdSide && thirdSide != firstSide)
            || (firstSide == thirdSide && thirdSide != secondSide))
        {
            System.out.println("It is a Isosceles Triangle.");
        }
        if (firstSide != secondSide && secondSide != thirdSide && thirdSide != firstSide) {
            System.out.println("It is a Scalene triangle.");
        }
    }
}
