public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("The number " + number + " is < 1");
            return false;
        }
        int sum = 0;
        int num = number;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                if (sum == num) {
                    System.out.println(number + " is a perfect number!");
                    return true;
                }
            }

        }
        System.out.println(number + " is not a perfect number!");
        return false;

    }
}
