import java.util.Scanner;

public class ZeroParaCancelar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros = new int[N];
        int topo = 0;

        for (int i = 0; i < N; i++) {
            int valor = sc.nextInt();

            if (valor != 0) {
                numeros[topo] = valor;
                topo++;
            } else if (topo > 0) {
                topo--; // "Desfaz" o último número válido
            }
        }

        int soma = 0;
        for (int i = 0; i < topo; i++) {
            soma += numeros[i];
        }

        System.out.println(soma);
    }
}
