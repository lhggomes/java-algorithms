package study;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class potenciaF {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int exp;
        int number;
        //while (sc1.hasNext()) {;
            number = sc1.nextInt();
            //boolean primeNumber = checkPrimesNumbers(number);;
//            if (primeNumber) {
//                System.out.println("1");
//            } else {
                exp = checkExponentLogarithm(number);
                System.out.println(exp);
          // }
        //}
       // return;
    }

    //Function to check if the number is a prime Number
    //If the rest of a division is 0, so, the number isn't a prime number
    static boolean checkPrimesNumbers(double A) {
        for (int i = 2; i < A; i++) {
            if (A % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int logarithm(int base, int number) {
        int mult = base;
        int count = 1;
        while(mult < number){
            mult = mult * base;
            count++;
        }
        if(mult == number)
            return count;
        return -1;
    }

    static int checkExponentLogarithm(int A) {
        int exponent;
        int base = (int)(Math.sqrt(A));
        for (int i = 2; i <= base; i++) {
            exponent = logarithm(i, A);
            if ((exponent != -1)) {
                return exponent;
            }
        }

        return 1;
    }

}
