public class PalindromicNumber {
    static int rev = 0;

    public static int palindrome(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;

        final int palindrome = palindrome(n / 10);
        return palindrome;
    }

    public static boolean whether(int n) {
        return (n == palindrome(n));
    }

    public static void main(String[] args) {
        int n = 101;
        PalindromicNumber palindromicNumber = new PalindromicNumber();

        if (palindromicNumber.whether(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
