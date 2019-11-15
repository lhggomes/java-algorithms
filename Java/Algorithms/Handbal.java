package maratona;

import java.util.Scanner;

public class Handbal {

    public static void main(String[] args) {
        int N, M, T;

        Scanner sc1 = new Scanner(System.in);

        N = sc1.nextInt();
        M = sc1.nextInt();

        // Será declara uma Matriz com os respectivos jogares e as partidas
        int rounds[][] = new int[101][101];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                rounds[i][j] = sc1.nextInt();;
            }
        }

        int cont = 0, semjogo = 0;
        for (int i = 0; i < N; i++) {
            cont = 0;
            // O For irá armazenar na variável CONT o numero de 0
            for (int j = 0; j < M; j++) {
                if (rounds[i][j] == 0) {
                    cont++;
                }
            }
            //Vamos contar a quantidade de 0 que há por jogador
            if (cont == 0) {
                semjogo++;
            }
        }
        System.out.println(semjogo);
    }
}
