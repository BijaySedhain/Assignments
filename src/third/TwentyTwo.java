package third;

import java.util.Scanner;


// Multiplication table of a number
public class TwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want the table of");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = num * i;
            System.out.println(num + " * " +i + " = " + table);

        }
    }
}
