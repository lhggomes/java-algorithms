

import java.util.Scanner;

public class CachorroQuente{

    public static void main(String[] args) {
        double H, P;
        double media;
        Scanner sc = new Scanner(System.in);
        H = sc.nextDouble();
        P = sc.nextDouble();
      
        media = H / P;
        System.out.printf("%.2f\n", media);

    }

}
