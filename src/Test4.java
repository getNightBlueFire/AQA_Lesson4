import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] test = new int[3][5][2];
        for (int i = 0; i < test.length; i++) {
            for (int i1 = 0; i1 < test[i].length; i1++) {
                for (int j = 0; j < test[i][i1].length; j++) {
                    test[i][i1][j] = random.nextInt(10,20);
                }
            }
        }

        System.out.println(Arrays.deepToString(test));
        System.out.println(Arrays.toString(test[2][1]));


    }
}
