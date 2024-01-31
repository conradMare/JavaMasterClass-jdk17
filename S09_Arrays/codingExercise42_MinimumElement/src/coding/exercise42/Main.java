package coding.exercise42;

import java.util.Scanner;

public class Main {
    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int cmv = Integer.MAX_VALUE;                 // 1
        for (int i = 0; i < array.length; i++) {     // 2
            if (array[i] < cmv) {                    // 3
                cmv = array[i];                      // 4
            }
        }
        return cmv;
    }
}
