public class TriangoloDispari {
    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(3));
        System.out.println(rowSumOddNumbers(5));
    }

    public static int rowSumOddNumbers(int n) {

        int firstOdd = n * (n - 1) + 1; //

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += firstOdd + 2 * i;
        }

        return sum;
    }
}
