public class Main {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
