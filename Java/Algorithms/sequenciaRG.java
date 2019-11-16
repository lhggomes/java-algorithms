package quadmagic;

import java.util.Scanner;

public class sequenciaRG {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int size = scan.nextInt();
            if (size == 0) {
                break;
            }
            int[] sequence = new int[size];

            for (int i = 0; i < sequence.length; i++) {
                sequence[i] = scan.nextInt();
            }
            if (checkSequenceRG(sequence, size, 0) > 0) {
                System.out.println("Sequence-RG.");

            } else {
                System.out.println("Not a Sequence-RG.");
            }

        }

    }

    static int checkSequenceRG(int sequence[], int terms, int index) {
        if (terms == 0) {
            return 0;
        }

        if (index == terms - 1) {
            return -1;
        }
        //This will make the subtraction of the data, like the sequencial procedure
        
        int result = sequence[index] - sequence[index + 1];
        
        //We're working with the data in modules, so we have to transform this
        if (result < 0) {
            result = result * -1;
        }
        //Making the next subtraction, using recursive procedure
        int next = checkSequenceRG(sequence, terms, index + 1);

        if (next == -1) {
            if(result != 1)
            {
                return -2;
            }
            return result;
        }

        if (result - 1 != next) {
            return -2;
        }
        return result;
    }
}
