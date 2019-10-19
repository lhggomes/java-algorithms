//package aula31;

import java.util.Scanner;

public class equacao {

    public static void main(String[] args) {
        double delta, raiz1, raiz2;
        int a, b, c;
        Scanner sc1 = new Scanner(System.in);
        while (sc1.hasNext()) {

            a = sc1.nextInt();
            b = sc1.nextInt();
            c = sc1.nextInt();

            if (a == 0) {
                System.out.println("Nao e uma equacao de grau 2");
            } else {

                delta = Math.pow(b,2) - 4 * a * c;

                if (delta < 0) {
                    System.out.println("Equacao: " + a + "(x2) + " + b + "(x) + " + c);
                    System.out.println("Solucao com 0 raizes reais");
                    System.out.println("X1: Nao existe raiz real");

                } else {

                    System.out.println("Equacao: "+a+"(x2) + "+b+"(x) + "+c);
                      
                    raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                    raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                    if (raiz1 == raiz2) {
                        System.out.println("Solucao com 1 raiz real");
                        System.out.println("X1: " + raiz1);

                    } else {
                        System.out.println("Solucao com 2 raizes reais");
                        System.out.println("X1: " + raiz1);
                        System.out.println("X2: " + raiz2);
                    }
                }
            }
        }

    }
}
