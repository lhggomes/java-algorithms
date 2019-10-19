package prova;

import java.util.Scanner;

public class Basquete {

    public static void main(String[] args) {
        int D,P; 
        P = 0;
        
        Scanner sc1 = new Scanner(System.in); 
        
        D = sc1.nextInt(); 
        
        if (D <= 800) {
            P = 1;
            
        }
        
        if (D > 800 && D <= 1400) {
        
            P = 2;
        }
        
         if (D > 1400 && D <= 2000) {
        
            P = 3;
        }
         
         System.out.println(P);
        
    }

}
