package listaexercicios.USP;

import java.util.Scanner;


public class somaVetorRecursivo {

    static int somaValoresVetor(int vetor[], int tamanho) {
        if (tamanho == 0) {
            return 0;

        }
        return vetor[tamanho -1] + somaValoresVetor(vetor, tamanho -1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeVector = scan.nextInt();
        int vector[] = new int[sizeVector];
        for (int i = 0; i < sizeVector; i++) {
            vector[i] = scan.nextInt();

        }

        System.out.println("A soma será:" + somaValoresVetor(vector, sizeVector));
    }

}
