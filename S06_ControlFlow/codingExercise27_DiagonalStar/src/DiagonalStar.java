public class DiagonalStar {
    public static void main(String[] args) {

        printSquareStar(15);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                if (row == 1 || row == number) {
                    for (int column = 1; column <= number; column++) {
                        System.out.print("*");
                    }
                } else {
                    for (int column = 1; column <= number; column++) {
                        if (column == 1 || column == row || column == (number - row + 1) || column == number) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}