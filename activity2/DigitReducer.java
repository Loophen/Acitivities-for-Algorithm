import java.util.Scanner;

public class DigitReducer {

    static int counter = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int value = scan.nextInt();

        int answer = reduceNumber(value);

        System.out.println("Final Result: " + answer);

        scan.close();
    }

    public static int reduceNumber(int num) {

        if (num <= 9) {

            return num;
        }

        System.out.println("Step " + counter + ":");

        String digits = String.valueOf(num);

        int total = 0;

        for (int i = 0; i < digits.length(); i++) {

            System.out.print(digits.charAt(i));

            total += Character.getNumericValue(digits.charAt(i));

            if (i < digits.length() - 1) {

                System.out.print(" + ");
            }
        }

        System.out.println(" = " + total);

        counter++;

        return reduceNumber(total);
    }
}