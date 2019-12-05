package maratona;

import java.util.Scanner;

public class checkNumber {

    public static int checkNumber(int A, int cont) {
        if (A == 1) {
            return cont;

        }

        if (A % 2 == 0) {
            return checkNumber(A / 2, cont + 1);
        } else {
            return checkNumber(3 * A + 1, cont + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int num = checkNumber(number, 0);

        System.out.println(num);
    }

}
