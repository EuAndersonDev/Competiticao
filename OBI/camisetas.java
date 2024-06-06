import java.util.Scanner;

public class camisetas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] preferencias = new int[N];
        
        for (int i = 0; i < N; i++) {
            preferencias[i] = in.nextInt();
        }

        int P = in.nextInt();
        int M = in.nextInt();

        int countPequeno = 0;
        int countMedio = 0;
        for (int i = 0; i < N; i++) {
            if (preferencias[i] == 1) {
                countPequeno++;
            } else if (preferencias[i] == 2) {
                countMedio++;
            }
        }
        if (countPequeno <= P && countMedio <= M) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
