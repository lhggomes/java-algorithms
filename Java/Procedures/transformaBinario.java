package aulas.projetoIntegrador;
public class transformaBinario {

    public int converteBinario(String number) {
        String numberToConvert = number;
        
          //Separating the numbers
          
        int[] array = new int[100];
        for (int i = 0; i < numberToConvert.length(); i++) {
            array[i] = numberToConvert.charAt(i) - 48;
        }
        int auxNumber = numberToConvert.length() - 1;
        int numberDecrememt = auxNumber;
        int sumNumber = 0;

        for (int i = 0; i <= auxNumber; i++) {
            sumNumber += array[i] * Math.pow(2, numberDecrememt);
            numberDecrememt--;
        }
        return sumNumber;

    }

}


