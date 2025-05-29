import java.util.*;

public class Idade2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as idades das irmãs
        int[] idades = new int[3];
        idades[0] = scanner.nextInt();
        idades[1] = scanner.nextInt();
        idades[2] = scanner.nextInt();

        // Ordenar o array
        Arrays.sort(idades);

        // A idade do meio estará na posição 1
        int idadeDeCamila = idades[1];

        // Imprimir a idade de Camila
        System.out.println(idadeDeCamila);
    }
}