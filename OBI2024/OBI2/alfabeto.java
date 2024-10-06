import java.util.Scanner;
public class alfabeto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String  alf, msg;
        int ccn=0;
        int K = in.nextInt(), N = in.nextInt();
        
        alf = in.nextLine();
        msg = in.nextLine();
        
        for (int i = 0; i < K; i++) {
            char currentChar = alf.charAt(i);
            int count = msg.length() - msg.replace(String.valueOf(currentChar), "").length(); 
            ccn += count;
        }
        if (ccn == N) {
            System.out.printf("S");
        } else {
            System.out.printf("N");
        }
    }
}
