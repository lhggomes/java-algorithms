package prova;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        int L, C;
        int r;
        int p = 0, resto;

        Scanner sc1 = new Scanner(System.in);

        L = sc1.nextInt();
        C = sc1.nextInt();

        r = (L + C);

        resto = (r % 2);

        if (resto == 0) {
            p = 1;
        }
        
        if (resto != 0) {
            p = 0;
        }

        System.out.println(p);

    }

}
