package Maratona;

import java.util.Scanner;
import java.util.Arrays;
public class feriasCansativas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int c = in.nextInt();
        int r = in.nextInt();
        int[] aC = new int[c];
        int[] aR = new int[r];
       
        for (int i = 0; i < c; i++) {
            aC[i] = in.nextInt();
        }
        for (int i = 0; i < r; i++) {
            aR[i] = in.nextInt();
        }
       int iC = 0, iR = 0;
       int count = 0;

       while (iC < c ||iR < r) {
            if (iC < c && d>= aC[iC]) {
                d-=aC[iC];
                iC++;
                count++;
            }else if (iR < r) {
                d+=aR[iR];
                iR++;
                count++;
            }else{
                break;
            }
       }
        System.out.println(count);
    }
}
