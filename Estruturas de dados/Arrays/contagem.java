import java.util.Scanner;
public class contagem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];
        int positivos = 0;
        int negativos = 0;

        for (int i=0; i<10; i++){
            n[i] = in.nextInt();
            if (n[i] > 0){
                positivos++;
            } else{
                negativos++;
            }
        }
        System.out.println("Quantidade de numeros positivos: " + positivos);
        System.out.println("Quantidade de numeros negativos: " + negativos);
    }
}
