import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n[] = new double[10];
        double media = 0;
        
        for (int i = 0; i < 10; i++){
            n[i] = in.nextInt();
            media += n[i];
        }
        media = media / 10;
        System.out.println(media);
    }
}
