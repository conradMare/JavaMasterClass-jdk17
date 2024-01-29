public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
        System.out.println(LargestPrime.getLargestPrime(7));
        System.out.println(LargestPrime.getLargestPrime(1));
        System.out.println(LargestPrime.getLargestPrime(16));
        System.out.println(LargestPrime.getLargestPrime(20));
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        int largestPrime = -1;
        int n = number;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n = n / i;
            }
        }

        if (n > 2)
            largestPrime = n;

        return largestPrime;
    }
}
