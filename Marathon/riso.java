package aula31;

import java.util.Scanner;

public class riso {

    public static void main(String[] args) {
        String risada, nova, invertida;

        nova = "";
        invertida = "";

        Scanner sc1 = new Scanner(System.in);

        risada = sc1.nextLine();

        for (int i = 0; i < risada.length(); i++) {
            if (risada.charAt(i) == 'a' || risada.charAt(i) == 'e' || risada.charAt(i) == 'i'
                    || risada.charAt(i) == 'o' || risada.charAt(i) == 'u') {

                nova = nova + risada.charAt(i);
            }
        }

        for (int i = nova.length() - 1; i >= 0; i--) {
            invertida = invertida + nova.charAt(i);

        }

        if (nova.equals(invertida)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

}
