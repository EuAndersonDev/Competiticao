import java.util.*;
public class diferenca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, b, c, d, diferenca;
        //insert values
        System.out.println("Insert value A:");
        a = in.nextInt();
        System.out.println("Insert value B: ");
        b = in.nextInt();
        System.out.println("Insert value C:");
        c = in.nextInt();
        System.out.println("Insert value D:");
        d = in.nextInt();
        //calculete the different the products A and B for products C and D
        diferenca = (a * b - c * d);

        System.out.println("The different of products is: "+diferenca);
    }
}
