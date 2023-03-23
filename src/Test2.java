public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int a1 = 10;
        int b1 = 20;

        a = b1;
        b = a1;

        System.out.println(a == 20 && b == 10);

    }
}
