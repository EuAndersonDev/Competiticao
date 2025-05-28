import java.util.Scanner;
import java.util.Arrays;

public class MaiorMenorArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = in.nextInt();
        }

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        in.close();
    }
}