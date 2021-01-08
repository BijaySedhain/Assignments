package Fourth;

import java.util.Scanner;


// Finding second largest number in the array.
public class FindSecondLargest {
    public static void main(String[] args) {
        int temp, noOfElements;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Elements you want in your array");
        noOfElements = input.nextInt();
        int array [] = new int[noOfElements];
        System.out.println("Enter the Elements");

        for (int i=0; i < noOfElements; i++) {
            array[i] = input.nextInt();
        }

        for (int i=0; i < noOfElements; i++) {
            for (int j = i+1 ; j < noOfElements; j++ ) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array [i] = array [j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Number is "+ array[1]);


        }
    }

