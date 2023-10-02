public class reverseTheNumberUsingRecursion {

    static int sum = 0;

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;

        sum = sum * 10 + rem;
        rev(n / 10);
    }

    static int rev2(int n) {
        // somethime you need might be need additional function in the argument
        // in that case you make another function name (helper function)

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {

        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }

    // number is palindrome or not

    static boolean palindrome(int n) {
        return n == rev2(n);
    }

    public static void main(String[] args) {

        System.out.println(palindrome(121));
    }
}
