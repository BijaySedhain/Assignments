package third;

import java.util.Scanner;


//Recieve ASCII code and display its Character.
public class Fifteen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a ASCII code");
        int acsii = input.nextInt();

        char ch = (char) acsii;
        System.out.println("The ACSII value of the given number is " +ch);
    }
}
