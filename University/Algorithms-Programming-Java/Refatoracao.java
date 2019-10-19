package aulas;

import java.util.Scanner;

public class Refatoracao {

    static int descubra(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (x * descubra(x, n - 1));
        }
    }

    static int caso(int a) {
        if (a < 5) {
            return (5 * a);
        } else {
            return (2 * caso(a - 5) + 4);
        }
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escolha um Problema (1 ou 2)");
        int opcao = sc1.nextInt();

        if (opcao == 1) {
            //Primeiro Caso de Teste
            System.out.println(descubra(2, 30));

        } else {
            // Segundo Caso de Teste
            int num = sc1.nextInt();
            System.out.println(caso(num));
        }

    }

}
