package second;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        A ();
        B ();
        C ();

    }

    public static void A () {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a:");
        double a = input.nextDouble();

        System.out.printf("Enter u:");
        double u = input.nextDouble();

        System.out.printf("Enter t:");
        double t = input.nextDouble();

        double s = u*t + 0.5*a*t*t;

        System.out.println("The value of t is " +s);
    }

    public static void B () {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a:");
        double a = input.nextDouble();

        System.out.printf("Enter b:");
        double b = input.nextDouble();

        System.out.printf("Enter c:");
        double c = input.nextDouble();

        double s = (a+b+c)/2;

        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area is "+area);

    }

    public static void C () {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a:");
        double a = input.nextDouble();

        System.out.printf("Enter b:");
        double b = input.nextDouble();

        System.out.printf("Enter c:");
        double c = input.nextDouble();

        double x = (-b + (Math.sqrt(b*b - 4*a*c))) / (2 * a);

        System.out.println("The value of x is "+x);
    }
}
