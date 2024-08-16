import java.util.Scanner;

public class concatena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int q = in.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            int soma = 0;
            for (int j = l - 1; j < r; j++) {
                for (int k = l - 1; k < r; k++) {
                    if (j != k) {
                        soma += Integer.parseInt(Integer.toString(vetor[j]) + Integer.toString(vetor[k]));
                    }
                }
            }
            System.out.println(soma);
        }
    }
}