public class Main {
    public static void main(String[] args) {
        int k = 10;
        int r = 2;
        int t = 3;

        k = r * 3 - t;
        System.out.println("k: " + k);k = r * 3 - t;
        System.out.println("k = " + k);

        k = r * (3 - t);
        System.out.println("k: " + k);

        float w = k + ((float)t / 2.0f);
        System.out.println("k: " + w);
    }
}