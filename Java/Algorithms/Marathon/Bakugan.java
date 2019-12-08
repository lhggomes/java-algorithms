package study;

import java.util.Scanner;

public class Bakugan {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int R = sc1.nextInt();
        while (sc1.hasNext()) {

            R = sc1.nextInt();
            if (R != 0) {
                break;
            }
        }
        //Declaring the Values of the Players 
        int pointsmark[] = new int[R];
        for (int i = 0; i < R; i++) {
            pointsmark[i] = sc1.nextInt();

        }

        int pointsleti[] = new int[R];
        for (int i = 0; i < R; i++) {
            pointsleti[i] = sc1.nextInt();

        }
        //Calling the functions to generate the values. 
        int summark = sumGeneralPoints(pointsmark);
        int sumleti = sumGeneralPoints(pointsleti);

        //Checking if the SUm of the ExtrPoints are equals
        String extraPoint = checkExtraPoint(pointsmark, pointsleti);

        if (extraPoint.equals("M")) {
            summark += 30;

        }

        if (extraPoint.equals("L")) {
            sumleti += 30;

        }

        if (sumleti > summark) {
            System.out.println("L");

        }

        if (summark > sumleti) {
            System.out.println("M");

        }

        if (summark == sumleti) {
            System.out.println("T");

        }
    }


public static int sumGeneralPoints(int[] A) {
        int sumpoint = 0;
        for (int i = 0; i < A.length; i++) {
            sumpoint += A[i];

        }

        return sumpoint;
    }

    //Function to compare the second condition of the problem (If a user take off the same monster three times, he wons 30 point..)
    public static String checkExtraPoint(int[] A, int[] B) {
        String winnerExtraPoint = "";
        int bonus = 0;
        int pointL = 0, contL = 0;
        int pointM = 0, contM = 0;

        int size = A.length - 2;
        for (int i = 0; i < size; i++) {

            if (bonus != 1) {

                if (A[i] == A[i + 1] && A[i] == A[i + 2]) {
                    contM += 30;
                    pointM = 1;
                    bonus = 1;

                }
                if (B[i] == B[i + 1] && B[i] == B[i + 2]) {
                    contL += 30;
                    pointL = 1;
                    bonus = 1;
                }
                if (pointL == 1 && pointM == 1) {

                    contL -= 30;
                    contM -= 30;
                }
            }

            if (contL > contM) {
                winnerExtraPoint = "L";

            } else {
                if (contM > contL) {
                    winnerExtraPoint = "M";

                } else {
                    winnerExtraPoint = "";
                }
            }

        }

        return winnerExtraPoint;
    }
}
