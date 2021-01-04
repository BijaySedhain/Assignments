package third;

public class Thirty {
    public static void main(String[] args) {
        int a = 0, b = 1, sum =0;

        for (int i = 1; i <= 10; i++) {

            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum);
            System.out.print(" ");
        }
    }
}
