package aulas.projetoIntegrador;

public class transformaOctal {

    public static String convertOctal(int number) {
        char octalData[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        String aswAux = "";
        int div;
        while (number > 0) {
            div = number%8;
            aswAux+=octalData[div];
            number = number / 8;

        }
        String convertedNumber = "";
       
        for (int i = aswAux.length() -1 ; i >= 0; i--) {
            char aux = aswAux.charAt(i);
            convertedNumber += aux;
                      
        }
        return convertedNumber;
    }
    
    public static void main(String[] args) {
        System.out.println(convertOctal(56));
    }

}
