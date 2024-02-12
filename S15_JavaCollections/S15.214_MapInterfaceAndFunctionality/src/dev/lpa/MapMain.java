package dev.lpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("-".repeat(45));

        Map<String, Contact> contacts = new HashMap<>();

        for (Contact contact : fullList) {
            contacts.put(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("-".repeat(45));
        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("Chuck Brown"));

//        IMPORTANT: "Chuck Brown" doesn't get added to the map, it is just there for convenience (nullPointer Exception),
//        added using 'getOrDefault':
        Contact defaultContact = new Contact("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-".repeat(45));
        contacts.clear();
        for (Contact contact : fullList) {
            Contact duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("-".repeat(45));
        contacts.clear();

//        Note: 'putIfAbsent' -> Won't put an updated value of the map, it just ignores the element
//        if it already finds something in the map for the key. This method returns an element if what is
//        already in the map for the key, but the method doesn't replace it with the current element.
//        It returns null if this is the first time an entry is being added to the map for that key:
        for (Contact contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

        System.out.println("-".repeat(45));
        contacts.clear();

        for (Contact contact : fullList) {
            Contact duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if (duplicate != null) {
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

//        Merge method (introduced in jdk8) -> Also takes a key and a value, but the third parameter is a BiFunction
//        interface, meaning it's a target for a lambda expression which takes two parameters and returns a result:
        System.out.println("-".repeat(45));
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
//                (previous, current) -> {
//                    System.out.println("prev: " + previous + " : current " + current);
//                    Contact merged = previous.mergeContactData(current);
//                    System.out.println("merged: " + merged);
//                    return merged;
//                }

//                (previous, current) -> previous.mergeContactData(current)

//                Replace lambda expression with method reference:
                Contact::mergeContactData
        ));
        contacts.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));
    }
}
