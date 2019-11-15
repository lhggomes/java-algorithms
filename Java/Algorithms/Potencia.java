package study;

import java.util.Scanner;

public class Potencia {

    static int[] factorsOf(int val) {
        int limit = (int) Math.ceil(Math.sqrt(val));
        int[] numArray = new int[limit];
        int index = 0;

        for (int i = 1; i <= limit; i++) {
            if (val % i == 0) {
                numArray[index++] = i;
                val /= i;
            }
        }
        numArray[index] = val;
        return numArray;

    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int A = sc1.nextInt();

        System.out.println(factorsOf(A));

    }

}
