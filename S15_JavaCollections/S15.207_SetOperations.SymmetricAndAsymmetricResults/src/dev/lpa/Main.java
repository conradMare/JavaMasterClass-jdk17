package dev.lpa;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com",
                "RHood@sherwoodforet.org");
        System.out.println(robinHood);

//        Performing union of two Sets:
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
//        printData("(A \u222A B) Union of emails (A) with phones (B)", unionAB);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

//        Performing intersect with two Sets:
        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
//        printData("(A \u2229 B) Intersect emails (A) and phones (B)",
//                intersectAB);
        printData("(A ∩ B) Intersect emails (A) and phones (B)",
                intersectAB);

//        Intersect order change (displaying phone not email):
        Set<Contact> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts);
        printData("(B ∩ A) Intersect phones (B) and emails (A)",
                intersectBA);

//        Asymmetric Differences:
        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) Intersect emails (A) and phones (B)",
                AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts);
        printData("(B - A) Intersect phones (B) and email (A)",
                BMinusA);

//        Symmetric Differences:
        Set<Contact> symmetricDif = new HashSet<>(AMinusB);
        symmetricDif.addAll(BMinusA);
        printData("Symmetric Difference: phones and emails", symmetricDif);

        Set<Contact> symmetricDif2 = new HashSet<>(unionAB);
        symmetricDif2.removeAll(intersectAB);
        printData("Symmetric Difference: phones and emails", symmetricDif2);
    }

    public static void printData(String header, Collection<Contact> contacts) {

        System.out.println("-".repeat(30));
        System.out.println(header);
        System.out.println("-".repeat(30));
        contacts.forEach(System.out::println);
    }
}
