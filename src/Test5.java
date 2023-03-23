import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] test = new int[]{1,23,2,3,4,4,5,6,0};
        System.out.println(Arrays.toString(test));
        int max1 = max(test);
        int a = test[max1];
        int min1 = min(test);
        int b = test[min1];

        int max11 = maxOrMin(test, true);
        int min11 = maxOrMin(test, false);



        test[max1] = b;
        test[min1] = a;
        System.out.println(Arrays.toString(test));
    }

    /**
     * dgjkhdfkgjadfklh;lkjg'
     *
     * sads
     * tgdrrfhf
     *
     * ds
     * h
     * f
     * ghfd
     * h
     * sd
     * t
     * r
     * gd
     * sfg
     * d
     * @param arr
     * @return
     */
    public static int min(int[] arr){
        int item = arr[0];
        int iposition = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean b = arr[i] < item;
            if (b){
                item = arr[i];
                iposition = i;
            }
        }
        return iposition;
    }

    public static int max(int[] arr){
        int item = arr[0];
        int iposition = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean b;
                b = arr[i] > item;
            if (b){
                item = arr[i];
                iposition = i;
            }
        }
        return iposition;
    }

    public static int maxOrMin(int[] arr, boolean min){
        int item = arr[0];
        int iposition = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean b;
            if (min){
                b = arr[i] > item;
            } else {
                b = arr[i] < item;
            }
            if (b){
                item = arr[i];
                iposition = i;
            }
        }
        return iposition;
    }

}
