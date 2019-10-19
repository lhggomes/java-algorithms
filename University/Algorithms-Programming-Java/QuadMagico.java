package study;

import java.util.Scanner;

public class QuadMagico {

    public static void main(String[] args) {

        //Include the data of the matrice 
        int N;
        Scanner sc1 = new Scanner(System.in);
        N = sc1.nextInt();
        N++;
        int D[][] = new int[N][N];
        for (int i = 1; i < D.length; i++) {
            for (int j = 1; j < D.length; j++) {
                D[i][j] = sc1.nextInt();
            }
        }

        int scolumn = sumcolumn(D);
        int sline = sumline(D);

        int diagf = sumdiagf(D);
        int diags = sumdiags(D);
       
        if(scolumn == sline && sline != -1){
            if (diagf == diags || diagf != -1) {
                System.out.println(diagf);
                
            }
        } else{ 
            System.out.println(-1);
            
        }
        
      
        
       
    }

    //SUM of the Lines and the Columns 
    public static int sumline(int[][] arr) {
        int vlinha = 0;
        int linha[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            
            for (int j = 1; j < arr.length; j++) {
                linha[i] = linha[i] + arr[i][j];

            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (linha[i] == linha[i + 1]) {
                vlinha = linha[i];

            }else{
                vlinha=-1;
            }

        }

        return vlinha;

    }

    public static int sumcolumn(int[][] arr) {
        int vcoluna = 0;
        int coluna[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            coluna[i] = 0;
            for (int j = 1; j < arr.length; j++) {
                coluna[i] = coluna[i] + arr[i][j];

            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (coluna[i] == coluna[i + 1]) {
                vcoluna = coluna[i];
            }else{
                vcoluna = -1;
            }

        }

        return vcoluna;

    }

    public static int sumdiagf(int[][] arr) {
        int sumdf = 0;
        for (int i = 1; i < arr.length; i++) {
            sumdf += arr[i][i];

        }

        return sumdf;

    }

    public static int sumdiags(int[][] arr) {
        int sumcs = 0;
        int tr = arr.length;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (tr == (i + j)) {
                    sumcs += arr[i][j];
                }
            }
        }

        return sumcs;
    }
}