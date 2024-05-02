import java.util.*;
public class Internet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //N = numero do mes
        //X = numero de megas
        //M_i = quantidade de megabytes usados
        
        int X, N;

        System.out.println("Insira os megas, X: ");
        X = in.nextInt();

        System.out.println("Insira a quantidade de meses, N: ");
        N = in.nextInt();
        int quotaAtual = X;
        for(int i=0; i<N; i++){

            System.out.println("Insira a quantidade de megas usados, M_i: ");
            int M_i = in.nextInt();
            quotaAtual += X - M_i ;
        }
        System.out.println(quotaAtual);
       
    }
}