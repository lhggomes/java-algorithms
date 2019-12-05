package maratona;

import java.util.Scanner;

public class quasePrimo {

    public static boolean checkDivisor(int number, int position) {

        if (number % position == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int j = 0;
        for (int i = 1; i <= number; i++) {
            if (checkDivisor(number, i) == true) {
                j++;

            }

        }
        if (j == 3) {
            System.out.println("S");

        } else {
            System.out.println("N");
        }

    }
}
