package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

//        myIntArray[0] = 45.0;
//        myIntArray[1] = "1";

//        NOTE TO SElF (research on) -> stackOverflow -- "Is it possible to cast an array from int to double?".
//                                                        "And is it possible to cast an array from String to an int".

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

//        ANONYMOUS ARRAY:

        int[] firstTen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

//        CAN'T USE ANONYMOUS ARRAY INITIALIZER OUTSIDE OF THE DECLARATION STATEMENT!
//        int[] newArray;
//        newArray = {5, 4, 3, 2, 1};

        int[] newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}