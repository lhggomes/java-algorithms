package listaexercicios.bubbleSort;

import java.util.Arrays;

public class bubbleSort {
    
    public static void main(String[] args) {
        int[] v = {35, 35, 45, 70, 22, 10, 2, 14, 28, 89};
        bubbleMethod(v);
        System.out.println(Arrays.toString(v));
        
    }
    
    public static void bubbleMethod(int[] v) {
        for (int lastNumber = v.length - 1; lastNumber > 0; lastNumber--) {
            for (int i = 0; i < lastNumber; i++) {
                if (v[i] > v[i + 1]) {
                    changePosition(v, i, i + 1);
                    
                }
            }
            
        }
    }
    
    public static void changePosition(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        
    }
    
}
