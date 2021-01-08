package Fourth;

import java.util.Scanner;


// Finding the duplicate
public class DuplicateWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string.");
        String str = input.nextLine().trim();

        String[] temp = str.split(" ");

        for (int i =0; i < temp.length; i++) {
            for (int j = i+1; j < temp.length; j++) {
                if (temp[i] == temp[j])
                    System.out.print(temp[j]);
                }
            }
        }

    }

