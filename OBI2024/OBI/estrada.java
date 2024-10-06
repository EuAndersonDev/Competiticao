import java.util.Arrays;
import java.util.Scanner;

public class Estrada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do comprimento total da estrada
        int T = scanner.nextInt();
        
        // Leitura do número de cidades
        int N = scanner.nextInt();
        
        // Leitura das posições das cidades
        int[] posicoes = new int[N];
        for (int i = 0; i < N; i++) {
            posicoes[i] = scanner.nextInt();
        }
        
        // Ordena as posições das cidades
        Arrays.sort(posicoes);
        
        // Calcula a menor vizinhança
        double menorVizinhanca = Double.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            double distancia = (posicoes[i] - posicoes[i - 1]) / 2.0;
            if (distancia < menorVizinhanca) {
                menorVizinhanca = distancia;
            }
        }
        
        // Imprime o resultado com duas casas decimais
        System.out.printf("%.2f%n", menorVizinhanca);
        
        scanner.close();
    }
}
