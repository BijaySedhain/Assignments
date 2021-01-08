package Fourth;

import java.util.Scanner;

// If the given number is Palindrome
public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String you would like to check.");
        String str = input.nextLine();

        if (isPalindrome(str))
            System.out.println("The String is Palindrome.");
        else
            System.out.println("The String is not Palindrome. ");

    }

    public static boolean isPalindrome (String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;j--;
        }
        return true;
    }
}
