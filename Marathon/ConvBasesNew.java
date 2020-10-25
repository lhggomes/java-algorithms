
package convbases;

import java.util.Scanner;

public class ConvBasesNew {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        int num = sc1.nextInt();
        double val=0;
        double aux = num;
        double resto = num;
        String binario = "";
        
        for(int i=0;i<num;i++){
            if(Math.pow(2, i) > num){
                val = i-1;
                break;
            }
        }
        
        for(double i=val; i>=0; i--){
            if (resto < Math.pow(2, i)){
                binario = binario + "0";
            }else {
                resto = aux - Math.pow(2, i);
                aux = resto;
                binario = binario + "1";
            }
        }
        
        System.out.println(binario);
        
    }
}
