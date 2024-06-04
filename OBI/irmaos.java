import java.util.*;
public class irmaos{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //mais velho Orlando
    //Otavio é o mais novo
    //Oscar é o mais novo
    int n, m, orlando;

    n =in.nextInt();
    m =in.nextInt();

    int dif = m-n;
    orlando= dif+m;
    System.out.println(orlando);
    }
}