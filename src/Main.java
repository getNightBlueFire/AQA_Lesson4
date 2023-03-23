import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr;
        arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10,99);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        int[] ints = {1, 4, 5, 6};
        arr[1] = ints;

        arr[2][1] = 0;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[2][3]);

    }


}