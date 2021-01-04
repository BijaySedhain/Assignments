package first;
import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius:");
        double radius = input.nextDouble();

        System.out.print("Enter height:");
        double height = input.nextDouble();;

        double volume = 3.141 * radius * radius * height;

        System.out.println("The volume of the cylinder is "+volume);

    }
}
