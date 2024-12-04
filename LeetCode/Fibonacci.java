import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        System.out.println(fib[n]);
    }
}