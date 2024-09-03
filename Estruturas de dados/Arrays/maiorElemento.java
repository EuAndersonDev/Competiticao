import java.util.Scanner;
public class maiorElemento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n[] = new int[10];

        int maior = 0;

        for (int i=0; i<10; i++){
            n[i] = in.nextInt();
            if (n[i] > maior){
                maior = n[i];
            }
        }
        System.out.println("O maior elemento da lista e: " + maior);
        

    }
}
