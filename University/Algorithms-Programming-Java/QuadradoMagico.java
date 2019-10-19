
package study;

import java.util.Scanner;

class QuadradoMagico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int matrice[][] = new int[size][size];

        // Reading the values for the Matrice
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrice[i][j] = scan.nextInt();
            }

        }

        boolean checkSumLinesAndColumns = checkSumLines(matrice);
    }

    public static boolean sumGeneral(int A[]) {
        boolean checkNativeSum = false;
        for ( int i = 0; i < A.length; i++) {
            if (A[i] == A[i + 1]) {
                checkNativeSum = true;

            }
        }

    }

    static boolean checkSumLinesAndColumns(int A[][]) {
        boolean checkValues = false;
        int sumNativeLines[] = new int[A.length];
        int sumNativeColumns[] = new int[A.length];

        // Making the Sum of the Columns and Lines
        for (int i = 0; i < A.length; i++) {
            for ( int j = 0; j < A.length; j++) {
                sumNativeLines[i] += A[i][j];
            }
        }

        for (int j = 0; j < A.length; i++) {
            for (int i = 0; i < A.length; j++) {
                sumNativeColumns[i] += A[i][j];
            }
        }

        if (sumGeneral(sumNativeColumns) == sumGeneral(sumNativeLines)) {
            checkValues = true;
            return checkValues;

        } else {
            return checkValues;

        }

    }
}