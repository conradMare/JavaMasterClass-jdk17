public class Main {
    public static void main(String[] args) {
        AllFactors.printFactors(278);
    }

    public class AllFactors {
        public static void printFactors(int number) {
            if (number < 1) {
                System.out.println("Invalid Value");
            }
            int i = 1;
            int factor = 0;
            while (i <= number) {
                if (number % i == 0) {
                    factor = i;
                    System.out.println(factor);
                }
                i++;
            }
        }
    }
}
