
import java.util.Scanner;

    static int numbers(int n){
        if(n==1){
            return n;
        }
        int result = numbers(n-1) +n;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers from 1 to N:");
        int n = sc.nextInt();
        numbers(n);
        
    }
    public class recursion {
}
