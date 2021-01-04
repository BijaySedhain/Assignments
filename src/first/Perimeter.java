package first;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double circlePerimeter = 2 * 3.141 * radius;
        System.out.println("The perimeter of a circle is "+circlePerimeter);

        System.out.println();

        System.out.printf("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.printf("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();
        double rectanglePerimeter = 2 * (length + breadth);
        System.out.println("The Perimeter of the rectangle is "+rectanglePerimeter);

        System.out.println();

        System.out.printf("Enter the first side of a triangle: ");
        double firstSide = input.nextDouble();
        System.out.printf("Enter the second side of a triangle: ");
        double secondSide = input.nextDouble();
        System.out.printf("Enter the third side of a triangle: ");
        double thirdSide = input.nextDouble();
        double trianglePerimeter = firstSide + secondSide + thirdSide;
        System.out.println("The Perimeter of the triangle is " +trianglePerimeter);



    }
}



