import java.util.Scanner;

class fibonnaci{
    
    public static int calculaFibonnaci (int numero){
        if(numero < 2){
            return 1;
        } 
        
        return calculaFibonnaci(numero - 1) + calculaFibonnaci(numero -2)  ;
    
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.print(" "+ calculaFibonnaci(i) + " ");
        }
    }
}