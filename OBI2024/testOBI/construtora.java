import java.util.Scanner;
public class construtora{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int resp = 0;
        int first, last, maior;
        first = in.nextInt();
        last = first;
        maior = first;

        for(int i = 1; i < n; i++){
            int cur = in.nextInt();
            maior = Math.max(maior, cur);
            resp += Math.abs(last - cur);
            last = cur;
        }
        resp += Math.abs(last - first);
        resp += Math.abs(maior - last);
        System.out.println(resp / 2);
    }
}