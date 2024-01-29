public class Main {
    public static void main(String[] args) {

        System.out.println("5ft, 9in = " + convertToCentimeters(5, 9) + "cm");
        System.out.println("69in = " + convertToCentimeters(69) + "cm");
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        // return convertToInches((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
