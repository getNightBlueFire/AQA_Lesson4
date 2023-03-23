import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int a = 9;
        Random random = new Random();
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10, 19);
            }
        }


        int mainSum = 0;
        int alterSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

//                if (i == j) {
//                    mainSum += arr[i][j];
//                }
//
//                if (i + j == a - 1) {
//                    alterSum += arr[i][j];
//                }
                if ((i + j) %2 == 1 ){
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println(mainSum);
        System.out.println(alterSum);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
