import java.util.*;
public class Quadrante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 || y == 0) {
            System.out.println("eixos");
        }
    }
}