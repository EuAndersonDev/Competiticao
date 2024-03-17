import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
    
        int a, b, soma;

        System.out.println("Insira o valor de A: ");
        a = in.nextInt();
        System.out.println("Insira o valor de B: ");
        b = in.nextInt();

        soma = a + b;

        System.out.println("Esse é o valor da soma: "+soma);
    

    }
}
