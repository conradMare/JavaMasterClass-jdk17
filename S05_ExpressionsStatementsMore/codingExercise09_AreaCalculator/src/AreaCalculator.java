public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("Radius of Circle = " + areaCircle(67));
        System.out.println("Area of Rectangle = " + areaRectangle(55, 99));
    }
    public static double areaCircle(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double PI = Math.PI;
            double areaofcircle = radius * radius * PI;
            return areaofcircle;

        }
    }

    public static double areaRectangle(double x, double y) {

        if (x < 0) {
            return -1;
        } else if (y < 0) {
            return -1;
        } else {
            double areaofrectangle = x * y;
            return areaofrectangle;

        }
    }
}