import java.util.Scanner;

public class invertendo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];
        int invertido[] = new int[10];

        for (int i=0; i<10; i++){
            n[i] = in.nextInt();
        }

        for (int i=0; i<10; i++){
            invertido[i] = n[n.length-1-i];
        }

        for (int i=0; i<10; i++){
            System.out.println(invertido[i]);
        }
    
    }
}
