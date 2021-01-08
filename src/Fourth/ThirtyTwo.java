package Fourth;

import java.util.Scanner;


//Accept array and find their sum
public class ThirtyTwo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("The sum is "+sum);


    }

}
