public class LastDigitChecker {
    public static void main(String[] args) {

        isValid(23);
        hasSameLastDigit(24, 21, 54);
    }
    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000){
            System.out.println("The number " + number + " is in range of 10 and 1000");
            return true;
        }
        System.out.println("The number " + number + "  is not in range of 10 and 1000");
        return false;
    }

    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {
        if ((numOne >= 10 && numOne <= 1000) && (numTwo >= 10 && numTwo <= 1000) && (numThree >= 10 && numThree <= 1000)){
            System.out.println("All The numbers " + numOne + ", " + numTwo + ", " + numThree + " are  in range of 10 and 1000");

            int digitA = numOne % 10;
            int digitB = numTwo % 10;
            int digitC = numThree % 10;

            if( (digitA == digitB) || (digitA == digitC) || (digitB == digitC) ) {
                System.out.println("True");
                return true;
            }
            System.out.println("False");

        }
        else {
            System.out.println("The given number " + numOne + ", " + numTwo + ", " + numThree + " is not in range of 10 and 1000");
            return false;
        }
        return false;
    }
}