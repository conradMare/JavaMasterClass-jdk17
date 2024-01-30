public class Main {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());

        System.out.println();

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);

        System.out.println("multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("divide = " + simpleCalculator.getDivisionResult());
    }
}
