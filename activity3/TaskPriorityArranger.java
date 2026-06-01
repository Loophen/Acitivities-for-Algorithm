

import java.util.Scanner;
import java.util.Stack;

class taskpriority {

    Stack<String> high = new Stack<>();
    Stack<String> medium = new Stack<>();
    Stack<String> low = new Stack<>();

    public void addTask(String task, String priority) {

        if (priority.equalsIgnoreCase("high")) {
            high.push(task);
        } else if (priority.equalsIgnoreCase("medium")) {
            medium.push(task);
        } else if (priority.equalsIgnoreCase("low")) {
            low.push(task);
        } else {
            System.out.println("Invalid priority. Use high/medium/low.");
        }
    }

    public void displayTasks() {
        System.out.println("\n--- TASK LIST ---");

        System.out.println("\nHIGH PRIORITY:");
        printStack(high);

        System.out.println("\nMEDIUM PRIORITY:");
        printStack(medium);

        System.out.println("\nLOW PRIORITY:");
        printStack(low);
    }

    private void printStack(Stack<String> stack) {
        if (stack.isEmpty()) {
            System.out.println("No tasks");
            return;
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("- " + stack.get(i));
        }
    }

    public void showStats() {
        int h = high.size();
        int m = medium.size();
        int l = low.size();

        System.out.println("\n--- TASK COUNT ---");
        System.out.println("High: " + h);
        System.out.println("Medium: " + m);
        System.out.println("Low: " + l);

        if (h >= m && h >= l) {
            System.out.println("Most tasks: HIGH priority");
        } else if (m >= h && m >= l) {
            System.out.println("Most tasks: MEDIUM priority");
        } else {
            System.out.println("Most tasks: LOW priority");
        }
    }
}

public class TaskPriorityArranger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        taskpriority tm = new taskpriority();

        while (true) {
            System.out.print("\nEnter task (or 'exit' to stop): ");
            String task = sc.nextLine();

            if (task.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter priority (high/medium/low): ");
            String priority = sc.nextLine();

            tm.addTask(task, priority);
        }

        tm.displayTasks();
        tm.showStats();

        sc.close();
    }
}