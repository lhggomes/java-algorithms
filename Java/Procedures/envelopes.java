package maratona;

import java.util.Scanner;

public class envelopes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rotulos = scan.nextInt();
        int tipos = scan.nextInt();
        int vector[] = new int[rotulos];
        int sumPos[] = new int[tipos + 1];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scan.nextInt();
            sumPos[vector[i]] += 1;

        }

        int menor = sumPos[1];

        for (int i = 1; i < sumPos.length; i++) {
            if (sumPos[i] < menor) {
                menor = sumPos[i];
            }

        }
        System.out.println(menor);
    }

}
