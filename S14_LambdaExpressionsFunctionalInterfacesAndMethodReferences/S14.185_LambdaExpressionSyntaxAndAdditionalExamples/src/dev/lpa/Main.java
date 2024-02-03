package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-".repeat(30));
        list.forEach((var myString) -> System.out.println(myString));

        System.out.println("-".repeat(30));
        String prefix = "nato";
//        String myString = "enclosing Method's myString";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
//        prefix = "NATO";

//        Compiler Error -> 'myString' goes outside of scope:
//        System.out.println(myString);
    }
}
