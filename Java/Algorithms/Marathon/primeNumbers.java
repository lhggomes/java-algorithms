package maratona;

import java.util.Scanner;

public class primeNumbers {

    public static boolean checkPrimes(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrixNumber = scan.nextInt();
        int[] primeNumbers = new int[matrixNumber+1];
        int j = 0;
        for (int i = 0; i <= matrixNumber; i++) {
            if (checkPrimes(i) == true) {
                primeNumbers[j] = i;
            }
            j++;
        }

        for (int i = 2; i < primeNumbers.length; i++) {
            if (primeNumbers[i] != 0) {
                System.out.print(primeNumbers[i] + " ");
            }

        }

    }

}
