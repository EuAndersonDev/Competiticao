import java.util.Scanner;

public class acelerador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        // Verifica se k é um número inteiro
        if ((D - 3) % 8 == 0) {
            System.out.println(2); // A partícula atingiu o sensor 2
        } else {
            // Verifica se a distância restante está mais próxima do sensor 1 ou 3
            if ((D - 3) % 8 <= 4) {
                System.out.println(1); // A partícula atingiu o sensor 1
            } else {
                System.out.println(3); // A partícula atingiu o sensor 3
            }
        }
    }
}