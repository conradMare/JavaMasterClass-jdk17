public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println();

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println();

//        for loop :
        for (double rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println();

//        Mini Challenge :
        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100, i);
            System.out.println("R100.00 at " + i + "% interest =  R" + interestAmount);
        }

        System.out.println();


//        break statement :
        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100, i);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("R100.00 at " + i + "% interest =  R" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
