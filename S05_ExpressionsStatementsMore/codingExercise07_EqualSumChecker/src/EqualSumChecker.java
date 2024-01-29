public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(7, 8 ,9));
    }
    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b) == c;
    }
}