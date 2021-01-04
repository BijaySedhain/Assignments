package third;

import java.util.Scanner;

public class Fourteen {
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter first Integer");
            int firstInteger = input.nextInt();

            System.out.println("Enter Second Integer");
            int secondInteger = input.nextInt();

            if (firstInteger == secondInteger)
                System.out.println("The entered numbers are equal");

            else if (firstInteger > secondInteger)
                System.out.println("First integer is greater than second integer");

            else if (firstInteger < secondInteger)
                System.out.println("First integer is less than second integer");

    }
   }
