package first;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double circleArea = 3.141 * radius * radius;
        System.out.println("The area of a circle is "+circleArea);

        System.out.println();

        System.out.printf("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.printf("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();
        double rectangleArea = length * breadth;
        System.out.println("The area of the rectangle is "+rectangleArea);

        System.out.println();

        System.out.printf("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.printf("Enter the height of the triangle: ");
        double height = input.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("The area of the triangle is " +triangleArea);



    }
}

