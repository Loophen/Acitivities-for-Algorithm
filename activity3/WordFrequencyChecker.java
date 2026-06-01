import java.util.Scanner;

class Node {
    String word;
    int count;
    Node next;

    Node(String word) {
        this.word = word;
        this.count = 1;
        this.next = null;
    }
}

class WordList {
    Node head;
    

    public void addWord(String word) {
        if (head == null) {
            head = new Node(word);
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.word.equalsIgnoreCase(word)) {
                current.count++;
                return;
            }

            if (current.next == null) break;
            current = current.next;
        }

        current.next = new Node(word);

        
    }

    public void mostFrequent() {
    Node current = head;
    Node maxNode = head;

    while (current != null) {
        if (current.count > maxNode.count) {
            maxNode = current;
        }
        current = current.next;
    }

    if (maxNode != null) {
        System.out.println("\nMost repeated word: " + maxNode.word + " - " + maxNode.count);
    }
    }

    public void showUnique() {
    Node current = head;

    System.out.println("\nWords that appear only once:");

    while (current != null) {
        if (current.count == 1) {
            System.out.println(current.word);
        }
        current = current.next;
    }
}
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.println(current.word + " - " + current.count);
            current = current.next;
        }
    }
}


public class WordFrequencyChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordList list = new WordList();

      try{ System.out.print("Enter sentence: ");
        String input = scan.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            word = word.trim();
            if (!word.isEmpty()) {
                list.addWord(word);
            }
        }
} catch(Exception e){
    System.err.println("An error occurred: "+e.getMessage());
}
        System.out.println("\nWord Frequency:");
        list.display();
        list.mostFrequent();
        list.showUnique();
        scan.close();
    }
    
}