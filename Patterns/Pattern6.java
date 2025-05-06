public class Main {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalCols;

            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
