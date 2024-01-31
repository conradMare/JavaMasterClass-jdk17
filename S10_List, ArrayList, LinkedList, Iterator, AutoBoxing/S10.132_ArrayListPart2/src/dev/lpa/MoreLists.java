package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "egg"};

//        'List' = a factory method:
        List<String> list = List.of(items);
        System.out.println(list);

//        Method to get an immutable list:

//        (METHOD BELOW CAN BE USED IN THE CREATION OF AN ARRAYLIST TO MAKE
//        POPULATING THE ARRAYLIST A BIT EASIER)

//        System.out.println(list.getClass().getName());
//        list.add("yogurt");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

//        Adding everything from nextList to groceries:
        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}