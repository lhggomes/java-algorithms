
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Circulo {

    public static void main(String[] args) throws IOException {

        double R,A;
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n", A);
    }

}
