import java.util.Scanner;
public class circunferencia {
    public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
        
        double a, n = 3.14159, r;

        System.out.println("entre com o valor do raio da circunferencia: ");
        r = in.nextDouble();

        a = n * (r*r);

        System.out.println("A area da circunferencia é de A =" +a);



    
    
    }
}
