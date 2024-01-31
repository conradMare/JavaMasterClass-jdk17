package coding.exercise42.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = readIntegers(5);
        System.out.println("My numbers = " + Arrays.toString(myNumbers));

        int min = findMin(myNumbers);
        System.out.println("Minimum = " + min);
    }

    static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        System.out.println("How many numbers you want to enter ?");
        count = scanner.nextInt();

        int[] myNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number #" + (i + 1));
            myNumbers[i] = scanner.nextInt();
        }
        return myNumbers;
    }

    public static int findMin(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }

        boolean findMin = false;
        int min = copiedArray[0];
        while (!findMin) {
            findMin = true;
            for (int i = 0; i < copiedArray.length; i++) {
                if (copiedArray[i] < min) {
                    min = copiedArray[i];
                    findMin = false;
                }
            }
        }
        return min;
    }
}