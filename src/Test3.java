public class Test3 {
    public static void main(String[] args) {

        int[][] test = new int[5][];

        test[0] = new int[]{1,23,4};
        test[1] = new int[]{1};
        test[2] = new int[3];
        test[2][0] = 1;
        test[2][1] = 2;
        test[2][2] = 3;
        test[3] = new int[]{10,20,23,4};
        test[4] = new int[]{13,3,3,4,0,1,4,4,5,23,4};

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + "   ");
            }
            System.out.println();
        }





    }
}
