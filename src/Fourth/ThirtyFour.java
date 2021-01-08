package Fourth;

import java.util.Scanner;


//reverse the Elements in the array
public class ThirtyFour {
    public static void main(String[] args) {
        int count, temp, start = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your array");
        count = input.nextInt();
        int array[] = new int[count];

        System.out.println("Enter Elements");
        for (int i = 0; i < count; i++) {
            array [i] = input.nextInt();
        }

        reverse(array, count);
    }

    public static void reverse (int a [], int n) {
        int [] array = new int[n];
        int j =n;
        for (int i = 0; i < n; i++) {
            array[j-1] = a[i];
            j = j - 1;
        }

        System.out.println("Reversed array:");
        for (int i =0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
