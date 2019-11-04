package listaexercicios.USP;

import java.util.Scanner;

public class potenciaRecursiva {
    static int calculaPotencia(int base, int exponencial){
        if (exponencial == 0){
            return 1;
        }
        return base * calculaPotencia(base, exponencial-1);
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int base = scan.nextInt();
        int exponencial = scan.nextInt(); 
        System.out.println(calculaPotencia(base, exponencial));
    }

}
