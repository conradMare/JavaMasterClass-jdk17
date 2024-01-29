public class GreatestCommonDivisor {
    public static void main(String[] args) {

        getGreatestCommonDivisor(11, 30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println("One of the given num is < 10");
            return -1;
        }
        int commonDivisor = 0;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                commonDivisor = i;
            }

        }
        System.out.println(commonDivisor);
        return commonDivisor;
    }
}
