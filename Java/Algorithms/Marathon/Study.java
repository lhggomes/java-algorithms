package study;

import java.util.Scanner;

public class Study {
      
    // Using Another Classes on JAVA
    
    static int potencia (int A, int B){
        int resultado = 1;
        for (int i = 1; i <= B; i++) {
            resultado = resultado * A; 
            
            
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        int X, Y; 
        Scanner sc1 = new Scanner(System.in); 
        X = sc1.nextInt(); 
        Y = sc1.nextInt();
        
        System.out.println(potencia(X, Y));
        
        
        
        
       
    }
    
}
