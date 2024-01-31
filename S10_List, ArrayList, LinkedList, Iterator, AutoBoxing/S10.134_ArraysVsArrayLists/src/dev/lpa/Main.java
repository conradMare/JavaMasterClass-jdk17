package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

////        Anonymous array:
//        String[] arrays = {"Array", "Creation", "Code"};
//        System.out.println(Arrays.toString(arrays));
//
//        ArrayList<String> arrayList = new ArrayList<>(List.of("ArrayList", "Creation", "Code"));
//        System.out.println(arrayList);

        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
