import java.util.Scanner;

public class RecursiveExponent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int number = sc.nextInt();

        System.out.print("Enter exponent: ");
        int power = sc.nextInt();

        System.out.println("Computation:");

        int output = calculate(number, power);

        System.out.println("Final Result: " + output);

        sc.close();
    }

    public static int calculate(int base, int exp) {

        if (exp == 0) {

            System.out.println(base + "^0 = 1");

            return 1;
        }

        System.out.println(base + "^" + exp + " = "
                + base + " * " + base + "^" + (exp - 1));

        int result = calculate(base, exp - 1);

        return base * result;
    }
}