package maratona;

import java.util.Scanner;

public class Album {

    public static void main(String[] args) {

        // O Vetor terá 101 posições, pois é o tamanho máximo do álbum
        int album[] = new int[101];
        int M, N;
        int faltam = 0;

        Scanner sc1 = new Scanner(System.in);

        N = sc1.nextInt();
        M = sc1.nextInt();

        //Ele irá preenhcer todos os campos com 0, que representa o tamanho do album
        for (int i = 1; i <= N; i++) {
            album[i] = 0;
        }
        int fig;

        //Agora, vamos informar a onde tem figurinha, que deverá ser preenchida com 1. 
        for (int i = 0; i < M; i++) {
            fig = sc1.nextInt();
            album[fig] = 1;
        }

        //Verificar onde existem Figurinhas que faltam para preenhcer
        for (int i = 1; i <= N; i++) {
            if (album[i] == 0) {
                faltam++;
            }

        }
        
        System.out.println(faltam);

    }

}
