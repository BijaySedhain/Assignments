package third;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the nth number");
        int num = input.nextInt();
        int sum = 0;
        for (int i =1; i <= num; i++) {
             sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}
