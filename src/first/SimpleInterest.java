package first;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.printf("Enter Time:");
        double time = input.nextDouble();

        System.out.printf("Enter Rate of Interest (in decimal): ");
        double rate = input.nextDouble();

        double simpleInterest = ( principal * time * rate ) / 100;

        System.out.println("The simple interest is " +simpleInterest);

    }
}
