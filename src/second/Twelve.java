package second;


import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Enter your roll:");
        int roll = input.nextInt();
        System.out.println("Enter your Nationality:");
        String nationality = input.nextLine();

        System.out.println("Roll no: "+roll + "\nName:" +name + "\nNationality:" +nationality);
    }
}
