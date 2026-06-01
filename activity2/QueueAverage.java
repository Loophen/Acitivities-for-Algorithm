import java.util.LinkedList;
import java.util.Scanner;

public class QueueAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedList<Integer> numbers = new LinkedList<>();

        while (true) {

            System.out.print("Enter a number or X to stop: ");
            String value = input.nextLine();

            if (value.equalsIgnoreCase("X")) {
                System.out.println("Program ended.");
                break;
            }

            int num = Integer.parseInt(value);

            if (numbers.size() >= 3) {

                int removedValue = numbers.removeFirst();

                System.out.println("Oldest value removed: " + removedValue);
            }

            numbers.addLast(num);

            showQueue(numbers);

            double avg = computeAverage(numbers);

            System.out.printf("Current Average: %.2f%n", avg);
        }

        input.close();
    }

    public static void showQueue(LinkedList<Integer> list) {

        System.out.println("Current Queue: " + list);
    }

    public static double computeAverage(LinkedList<Integer> list) {

        int total = 0;

        for (int value : list) {

            total += value;
        }

        return (double) total / list.size();
    }
}