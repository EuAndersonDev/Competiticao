import java.util.Scanner;

public class CodigoOBI2015{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] codigos = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            codigos[i] = in.nextInt();
        }
        for(int i = 0; i <= n - 3 ; i++){
            if (codigos[i] == 1 && codigos[i+1] == 0 && codigos[i+2] == 0) {
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);
        
    }
}