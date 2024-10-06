import java.util.Scanner;
public class cubo {
    
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.println();
        n = in.nextInt();

        int semPintura = (n - 2) * (n - 2) * (n - 2);
        int umaPintura = 6 * (n - 2) * (n - 2);
        int duasPinturas = 12 * (n - 2);
        int tresPinturas = 8;
        System.out.printf("%d\n", semPintura);
        System.out.printf("%d\n", umaPintura);
        System.out.printf("%d\n", duasPinturas);
        System.out.printf("%d\n", tresPinturas);
    }
}
