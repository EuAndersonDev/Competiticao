import java.util.*;
public class premioMilhao{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int m = 0, dias = 0;

            for (int i = 0; i < n; i++){
                a[i] = in.nextInt();
                m += a[i];
                if (m > 1000000){
                    break;
                }
                dias++;
            }
            
        in.close();
        System.out.println(dias);
    }
}