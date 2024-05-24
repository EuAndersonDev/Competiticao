import java.util.*;
import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as idades das irmãs
        int idade1 = scanner.nextInt();
        int idade2 = scanner.nextInt();
        int idade3 = scanner.nextInt();

        // Identificar a idade do meio sem usar Arrays.sort
        int idadeDeCamila;
        
        if ((idade1 > idade2 && idade1 < idade3) || (idade1 < idade2 && idade1 > idade3)) {
            idadeDeCamila = idade1;
        } else if ((idade2 > idade1 && idade2 < idade3) || (idade2 < idade1 && idade2 > idade3)) {
            idadeDeCamila = idade2;
        } else {
            idadeDeCamila = idade3;
        }

        // Imprimir a idade de Camila
        System.out.println(idadeDeCamila);
    }
}
