package Fourth;

import java.util.Scanner;


// Duplicate letter
public class DuplicateLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string.");
        String str = input.nextLine().trim();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1;j< str.length(); j++ ) {
                if (str.charAt(i) == str.charAt(j))
                    System.out.print(str.charAt(j)+ " ");
            }
        }
    }
}