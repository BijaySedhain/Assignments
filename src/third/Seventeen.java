package third;

import java.util.Scanner;

//Calculate the leap year
public class Seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = input.nextInt();
        boolean leap ;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;


            if (leap)
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        }
    }
}

