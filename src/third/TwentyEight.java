package third;

import java.util.Scanner;


//Prime Number
public class TwentyEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        isPrimeNumber(num);
        firstNthPrime(num);
        System.out.println();
        allPrimeBetween(12, 40);

        }

    public static void isPrimeNumber(int num) {
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }

    public static void firstNthPrime(int num) {
        int low = 1;

        while (low < num) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {

                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }


    }

    public static void allPrimeBetween(int start, int end) {


        while (start < end) {
            boolean flag = false;

            for (int i = 2; i <= start / 2; ++i) {

                if (start % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && start != 0 && start != 1)
                System.out.print(start + " ");

            ++start;
        }
    }
}

