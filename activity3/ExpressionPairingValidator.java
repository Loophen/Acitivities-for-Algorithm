import java.util.Scanner;
import java.util.Stack;

class ExpressionValidator {

    public void validate(String expr) {
        Stack<Character> stack = new Stack<>();
        int pairCount = 0;
        boolean balanced = true;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

           
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    System.out.println("Mismatch found at position " + i + ": unexpected '" + ch + "'");
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if (!isMatch(top, ch)) {
                    System.out.println("Mismatch found at position " + i + ": '" + top + "' does not match '" + ch + "'");
                    balanced = false;
                    break;
                }

                pairCount++;
            }
        }

        
        if (balanced && !stack.isEmpty()) {
            System.out.println("Mismatch: some opening symbols are not closed.");
            balanced = false;
        }

        
        if (balanced) {
            System.out.println("Expression is BALANCED");
        } else {
            System.out.println("Expression is NOT BALANCED");
        }

        System.out.println("Total pairs formed: " + pairCount);
    }

   
    private boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}


public class ExpressionPairingValidator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
           
            String input;
            
               
                    System.out.print("Enter expression: ");
                input = scan.nextLine();

              
                ExpressionValidator ev = new ExpressionValidator();
                ev.validate(input);
                
        }catch (Exception e){
            System.out.println("An error occurred: "+e.getMessage());
        }
    }
}