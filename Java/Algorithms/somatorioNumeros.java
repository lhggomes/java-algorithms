package listaexercicios.USP;

import java.util.Scanner;

public class somatorioNumeros {

    static int somatorioNumero(int A) {
        if(A == 0){
            return 0;
        }
        return A + somatorioNumero(A- 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int fimnum = scan.nextInt(); 
        System.out.println("O somatório será: " + somatorioNumero(fimnum));

    }
}
