package third;

import java.util.Scanner;


//Whether the number is odd or even
public class Sixteen {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");

    }

}
