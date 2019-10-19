package maratona;

import java.util.Scanner;

public class TV {
    public static void main(String[] args) {
        int V, T; 
        
        Scanner sc1 = new Scanner(System.in); 
        
        V = sc1.nextInt(); 
        T = sc1.nextInt(); 
        
        int A[] = new int [T]; 
        
        for (int i = 0; i < A.length; i++) {
            A[i] = sc1.nextInt();
            
        }
        
        int nvolume = V; 
        
        for (int i = 0; i < T; i++) {
            nvolume = nvolume + (A[i]);
            
            if(nvolume < 0){
                nvolume = 0; 
            }
            
            if (nvolume > 100){
                nvolume = 100; 
            }
                        
        }
        
        System.out.println("O volume da TV eh: "+nvolume);
        
    }
    
}
