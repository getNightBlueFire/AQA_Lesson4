public class Test7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        do {
            System.out.println(a);
            int temp = a;
            a = a + b;
            b = temp;

            ++c;
        } while (c < 5);

    }
}
