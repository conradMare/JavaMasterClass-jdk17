package dev.lpa;

public class Main {
    public static void main(String... args) {

        System.out.println("Hello World, again");

//        SPLIT METHOD -> splits the String into a String array with whatever
//        delimiter you tell it to use:
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

//        Anonymous Array (no method type):
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

//    private static void printText(String[] textList) {
//
//        for (String t : textList) {
//            System.out.println(t);
//        }
//    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}