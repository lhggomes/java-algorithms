package study;

import java.util.Scanner;

public class campeonato {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int cormengo[] = new int[3];
        int flaminthias[] = new int[3];
        //Reading the values of the respectives scores
        for (int i = 0; i < cormengo.length; i++) {
            cormengo[i] = sc1.nextInt();

        }

        for (int i = 0; i < flaminthias.length; i++) {
            flaminthias[i] = sc1.nextInt();

        }

        int scoresCormengo = sumScores(cormengo);
        int scoresFlaminthias = sumScores(flaminthias);

        if (scoresCormengo == scoresFlaminthias) {
            if (flaminthias[2] > cormengo[2]) {
                System.out.println("F");

            }
            if (cormengo[2] > flaminthias[2]) {
                System.out.println("C");

            }

            if (flaminthias[2] == cormengo[2]) {
                System.out.println("=");

            }

        } else {
            if (scoresCormengo > scoresFlaminthias) {
                System.out.println("C");

            }
            if (scoresFlaminthias > scoresCormengo) {
                System.out.println("F");

            }

        }

    }

    public static int sumScores(int A[]) {
        int sumScoresValues = 0;
        sumScoresValues += A[0] * 3;
        sumScoresValues += A[1] * 1;

        return sumScoresValues;

    }

}
