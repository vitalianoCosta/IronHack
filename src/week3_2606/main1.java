package week3_2606;

public class main1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 9;

        // int product = multiply(x, y);
        int product = 0;
        long longProduct = 0;
        try {
            product = multiply(x, y);
        } catch (IllegalArgumentException e) {
            System.out.println("Using long version...");
            longProduct = multiply((long) x, (long) y);
        }

        System.out.println(product != 0 ? product : longProduct);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        if (product / a != b) {
            throw new IllegalArgumentException("Product too large for int");
        }
        return a * b;
    }

    public static long multiply(long a, long b){
        return a * b;
    }
}
