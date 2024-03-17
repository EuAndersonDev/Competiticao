import java.util.Scanner;
public class media2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Insira as notas do aluno1: ");
        n1 = in.nextDouble();
        System.out.println("Insira as notas do aluno1: ");
        n2 = in.nextDouble();
        System.out.println("Insira as notas do aluno1: ");
        n3 = in.nextDouble();
        media = (n1 + n2 + n3)/3;

        System.out.println("A media do aluno 1 é: "+media);
    }
}