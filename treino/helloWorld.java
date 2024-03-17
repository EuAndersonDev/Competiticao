import java.util.*;
public class helloWorld {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);

        int a, b, x;

        System.out.println("insira o valor A: ");
        a = in.nextInt();

        System.out.println("insira o valor B: ");
        b = in.nextInt();

        x = a + b;
        System.out.println("X = " + x);
    
    }
}