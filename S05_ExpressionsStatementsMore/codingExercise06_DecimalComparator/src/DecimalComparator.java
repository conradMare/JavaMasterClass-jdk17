public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(23.17, 44.99));
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        int convertedValue1 = (int) (value1 * 1000);
        int convertedValue2 = (int) (value2 * 1000);

        if (convertedValue1 == convertedValue2) {
            System.out.println(value1 + " = " + value2 + " up to 3 decimal points");
            return true;
        }
        System.out.println(value1 + " != " + value2 + " up to 3 decimal points");
        return false;
    }
}