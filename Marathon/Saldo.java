package prova;

import java.util.Scanner;

public class Saldo {

    public static void main(String[] args) {
        int saldomenor, dias, valor;
        int saldoini, s;
        Scanner sc1 = new Scanner(System.in);

        dias = sc1.nextInt();
        saldoini = sc1.nextInt();
        saldomenor = 1500000000;
        s = saldoini;
        for (int i = 0; i < dias; i++) {
            valor = sc1.nextInt();

            s = s + valor;

            if (s < saldomenor) {
                saldomenor = s;

            }
        }
        
        System.out.println(saldomenor);

    }

}
