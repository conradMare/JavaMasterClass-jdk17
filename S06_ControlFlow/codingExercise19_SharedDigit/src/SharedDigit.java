public class SharedDigit {
    public static void main(String[] args) {
        // Checks if 12 and 23 shared a digit.
        System.out.println(hasSharedDigit(12, 23));

        // Checks if 9 and 99 shared a digit.
        System.out.println(hasSharedDigit(9, 99));

        // Checks if 15 and 55 shared a digit.
        System.out.println(hasSharedDigit(15, 55));
    }

    /**
     * Checks if two numbers have shared a digit.
     */
    public static boolean hasSharedDigit(int a, int b) {
        // Checks for invalid value.
        if ((a < 10) || (b < 10) || (a > 99) || (b > 99)) {
            return false;
        }

        // Stores the last digit of var. a.
        int lastDigitA = a % 10;
        a /= 10;

        // Stores the first digit of var. a.
        int firstDigitA = a % 10;

        // Stores the last digit of var. b.
        int lastDigitB = b % 10;
        b /= 10;

        // Stores the first digit of var. b.
        int firstDigitB = b % 10;

        return ((lastDigitA == firstDigitB) || (lastDigitA == lastDigitB) || (firstDigitA == firstDigitB)
                || (firstDigitA == lastDigitB));
    }

}
