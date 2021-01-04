package third;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int reversed = 0;
        System.out.println("Enter the number to be reversed.");
        int num = input.nextInt();

        while (num != 0) {
            int i = num % 10;
            reversed = reversed * 10 + i;
            num /= 10;
        }
        System.out.println("Reversed Number: " +reversed);
    }
}
