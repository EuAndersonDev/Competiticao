package Maratona;

import java.util.Scanner;

class alturaMinima {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();

            if (a <= h) {
                j++;
            }else{
                continue;
            }
        }

        System.out.println(j);
    }
}