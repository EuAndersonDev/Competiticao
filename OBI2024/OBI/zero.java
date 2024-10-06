import java.util.*;
public class zero {
    private static char[] soma;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] z = new int[n];
        
        for(int i = 0; i < n; i++){
            z[i] = in.nextInt();
        }
        for(int j = n; j != 0; j--){
            if (z[j] == 0) {
                int exc = z[j-1];
            }else{
            }
        }
        System.out.println(soma);
    }
    
}
