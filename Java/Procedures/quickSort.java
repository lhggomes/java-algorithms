package listaexercicios.bubbleSort;
import java.util.Arrays;
public class quickSort {
    public static void main(String[] args) {
        int[] v = {6, 3, 4, 5, 2, 7, 1, 9, 8, 0};
        quickSort(v, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }
    private static void quickSort(int[] v, int left, int right) {
        if (left < right) {
            int j = separate(v, left, right);
            quickSort(v, left, j - 1);
            quickSort(v, j + 1, right);
        }
    }
    private static int separate(int[] v, int left, int right) {
        int i = left + 1;
        int j = right + 1;
        int pivot = v[left];
        while (i <= j) {
            if (v[i] <= pivot) {
                i++;
            } else if (v[j] > pivot) {
                j--;
            } else if (i <= j) {
                changePosition(v, i, j);
                i++;
                j--;
            }
        }
        changePosition(v, left, j);
        return j;
    }
    private static void changePosition(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
