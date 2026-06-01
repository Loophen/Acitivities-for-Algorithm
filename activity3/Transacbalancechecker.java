
import java.util.Scanner;

class Node {
    double amount;
    double balance;
    Node next;

    public Node(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
        this.next = null;
    }
}

class TransactionListModule {
    Node head;
    double currentBalance = 0;
    double lowestBalance = Double.MAX_VALUE;

    public void addTransaction(double amount) {

        currentBalance += amount;

        Node newNode = new Node(amount, currentBalance);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // track lowest balance
        if (currentBalance < lowestBalance) {
            lowestBalance = currentBalance;
        }

        System.out.println("Updated Balance: " + currentBalance);
    }

    public void showSummary() {
        System.out.println("\n--- TRANSACTION HISTORY ---");

        Node temp = head;
        while (temp != null) {
            System.out.println("Amount: " + temp.amount + " | Balance: " + temp.balance);
            temp = temp.next;
        }

        System.out.println("\nFinal Balance: " + currentBalance);
        System.out.println("Lowest Balance: " + lowestBalance);

        if (currentBalance >= 0) {
            System.out.println("Result: GAIN");
        } else {
            System.out.println("Result: LOSS");
        }
    }
}

public class Transacbalancechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionListModule tl = new TransactionListModule();

        while (true) {
            System.out.print("\nEnter amount (+income / -expense) or '0' to stop: ");
            double amount = sc.nextDouble();

            if (amount == 0) {
                break;
            }

            tl.addTransaction(amount);
        }

        tl.showSummary();

        sc.close();
    }
}