import java.util.*;
import java.util.Random;
public class caju{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random ro = new Random();
    int linhas, colunas, m, n;
    linhas = in.nextInt();
    colunas = in.nextInt();
    m = in.nextInt();
    n = in.nextInt();

    int plantacao[][] = new int[linhas][colunas];

    //preenchendo a matriz com valores aleatorios
    for(int i=0; i<linhas; i++){
        for(int j=0; j<colunas;j++){
            colunas [i][j] = ro.nextInt()%50;
        }
    }

    }
}