public class Main {
    public static void main(String[] args) {
        int n = 87008;
        int c=0;
        System.out.println(countZeros(n,c));
    }

    public static int countZeros(int n, int c) {
        if (n == 0 && c == 0) {
            return 1;
        }
        if (n == 0) {
            return c;
        }
        if (n % 10 == 0) {
            return countZeros(n / 10, c + 1);
        }
        return countZeros(n / 10, c);
    }
}
