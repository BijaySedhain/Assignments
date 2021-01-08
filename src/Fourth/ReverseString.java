package Fourth;

import java.util.Scanner;


// Reverse the String
public class ReverseString {
    public static void main(String[] args) {
        String result ="";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String you would like to reversed.");
        String str = input.nextLine().trim();

        for (int i = (str.length()-1); i >=0; i--) {
         result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
