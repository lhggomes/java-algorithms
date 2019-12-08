import java.util.Scanner;

class fatorial{
    
    public static int calculaFatorial(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * calculaFatorial(numero- 1); 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int numero = scan.nextInt(); 
        System.out.println(calculaFatorial(numero));
    }
}