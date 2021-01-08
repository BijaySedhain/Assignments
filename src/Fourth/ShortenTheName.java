package Fourth;

import java.util.Scanner;


// Shorten the first and middle name
public class ShortenTheName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Name of the person.");
        String name = input.nextLine().trim();

        String[] temp = name.split(" ");


        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(temp[i].charAt(0) + ". ");
        }
        System.out.print(temp[temp.length-1]);
    }
}
