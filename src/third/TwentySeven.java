package third;

import java.util.Scanner;


//Sum and Product of digits
public class TwentySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = input.nextInt();

        int sum = 0, product = 1, n;

        while (num > 0) {
            n = num % 10;

            sum = sum + n;
             product = product * n;

            num = num / 10;

        }
        System.out.println("Sum = " +sum);
        System.out.println("product = " +product);
    }
}
