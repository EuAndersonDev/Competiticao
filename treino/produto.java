import java.util.Scanner;

public class produto {
      public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
    
        int a, b, prod;

        System.out.println("Insira o valor de A: ");
        a = in.nextInt();
        System.out.println("Insira o valor de B: ");
        b = in.nextInt();

        prod = a * b;

        System.out.println("Esse é o valor do produto: " +prod);
    
    }
}
