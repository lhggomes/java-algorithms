package aulas.projetoIntegrador;

import java.util.Scanner;

public class startMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        transformaBinario binario = new transformaBinario();
        transformaOctal octal = new transformaOctal();
        System.out.println("Informe uma opção desejada:");
        System.out.println("1 - Converter p/  Binário");
        System.out.println("2 - Converter p/ Octal");
        System.out.println("0 - Sair");
        int aux = scan.nextInt();

        switch (aux) {
            case 0:
                break;
            case 1:
                System.out.println("Informe um numero para conversão:");
                System.out.println("O numero em decimal é:" + binario.converteBinario(scan.next()));
                break;
            case 2:
                System.out.println("Informe um numero para conversão:");
                String outPut = transformaOctal.convertOctal(binario.converteBinario(scan.next()));
                System.out.println("O numero em octal é:" + outPut);
                break;
            default:
                System.out.println("Operação Invalida");
        }

    }
}
