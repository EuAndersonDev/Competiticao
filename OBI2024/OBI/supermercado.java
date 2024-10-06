import java.util.Scanner;
public class supermercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        double menorPreco = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double preco = in.nextDouble();
            int gramas = in.nextInt();
            double precoPorQuilo = preco * 1000 / gramas;
            
            if (precoPorQuilo < menorPreco) {
                menorPreco = precoPorQuilo;
            }
        }
        
        System.out.printf("%.2f%n", menorPreco);
    }
}

