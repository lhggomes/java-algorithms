package procedures;

public class SquencialSearch {
// The function is used to check the positon the number on the vector
// It'll return the fisrt position when he finds the number 

    static int squencialSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] v = {9, 8, 7, 5, 4, 3, 2};
        System.out.println(squencialSearch(v, 4));
        System.out.println(squencialSearch(v, 12));
    }

}
