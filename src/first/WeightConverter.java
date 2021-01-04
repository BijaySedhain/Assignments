package first;
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pound: ");
        double pound = input.nextDouble();

        double kg = pound * 0.454;

        System.out.println("The converted weight in kg is "+kg);

    }
}
