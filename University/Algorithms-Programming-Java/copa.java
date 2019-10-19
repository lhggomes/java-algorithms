package study;

import java.util.Scanner;

public class copa {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int T = sc1.nextInt();
        int N = sc1.nextInt();
        String team[] = new String[T];
        int[] score = new int[T];

        for (int i = 0; i < team.length; i++) {
            team[i] = sc1.next();
            score[i] = sc1.nextInt();

        }

        int sumscores = compositionScore(score);
        int tieds = 3 * N - sumscores;
        System.out.println(tieds);

    }

    public static int compositionScore(int[] sumPoint) {
        int sumAll = 0;
        for (int i = 0; i < sumPoint.length; i++) {
            sumAll += sumPoint[i];

        }

        return sumAll;

    }

}
