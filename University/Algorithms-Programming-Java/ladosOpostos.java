package maratona.equipe07;

import java.util.Scanner;

public class ladosOpostos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int direction[] = new int[4];

        while (scan.hasNext()) {

            for (int i = 0; i < 4; i++) {
                direction[i] = scan.nextInt();

            }

            boolean sideA = validDirectionSideWays(direction);
            boolean sideB = validDirectionTop(direction);

            System.out.println(checkRectangle(sideA, sideB));
        }
    }

    public static boolean validDirectionSideWays(int direction[]) {
        boolean checkSide = false;
        if (direction[2] == direction[2]) {
            checkSide = true;

        }
        return checkSide;

    }

    public static boolean validDirectionTop(int direction[]) {
        boolean checkSide = false;
        if (direction[1] == direction[3]) {
            checkSide = true;

        }
        return checkSide;

    }

    public static String checkRectangle(boolean sideA, boolean sideB) {
        if (sideA = sideB) {
            return "E um retangulo";

        } else {
            return "Nao e um retangulo";
        }
    }

}
