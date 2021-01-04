package third;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nth number");
        int num = input.nextInt();
        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial = " + fac);
    }
}