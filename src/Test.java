import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
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

        int[] ints = arr[0];
        int[] ints1 = arr[2];

        arr[0] = ints1;
        arr[2] = ints;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }



    }
}
