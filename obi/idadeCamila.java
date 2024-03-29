import java.util.Scanner;

public class idadeCamila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo as idades das irmãs
        int idadeCibele = scanner.nextInt();
        int idadeCamila = scanner.nextInt();
        int idadeCeleste = scanner.nextInt();

        // Verificando a idade de Camila
        if (idadeCibele < idadeCamila && idadeCamila < idadeCeleste) {
            System.out.println(idadeCamila);
        } else if (idadeCeleste < idadeCamila && idadeCamila < idadeCibele) {
            System.out.println(idadeCamila);
        } else if (idadeCamila < idadeCeleste && idadeCeleste < idadeCibele) {
            System.out.println(idadeCamila);
        } else if (idadeCamila < idadeCibele && idadeCibele < idadeCeleste) {
            System.out.println(idadeCamila);
        } else if (idadeCeleste < idadeCibele && idadeCibele < idadeCamila) {
            System.out.println(idadeCamila);
        } else {
            System.out.println("As idades não estão em conformidade com as restrições.");
        }

        scanner.close();
    }
}
