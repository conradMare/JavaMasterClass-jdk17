package coding.exercise44.example;

import coding.exercise44.Contact;
import coding.exercise44.MobilePhone;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("987654321");

    public static void main(String[] args) {

        startPhone();
        phoneOptions();
        boolean tunOn = true;
        int pressedButton = 0;

        while (tunOn) {
            System.out.println("Select an option: (6. to Show Options.)");
            pressedButton = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (pressedButton) {
                case 0:
                    System.out.println("Shut down...");
                    tunOn = false;
                    break;
                case 1:
                    searchContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    showContact();
                    break;
                case 6:
                    phoneOptions();
                    break;
            }

        }


    }

    public static void startPhone() {
        System.out.println("Start Phone...");
    }

    public static void phoneOptions() {

        System.out.println("\n Enter a number: \n" +
                "\t 0. Shut down. \n" +
                "\t 1. Search Contact.\n" +
                "\t 2. Add new Contact.\n" +
                "\t 3. Modify Contact.\n" +
                "\t 4. Delete Contact.\n" +
                "\t 5. Show Contact List.\n" +
                "\t 6. Show Options.");
    }

    public static void searchContact() {
        System.out.println("Enter contact name to search: ");
        String contactName = scanner.nextLine();
        contactName = contactName.substring(0, 1).toUpperCase() + contactName.substring(1).toLowerCase();
        Contact contact = mobilePhone.queryContact(contactName);
        if (contact != null) {
            System.out.println("Name: " + contact.getContactName() + " Number: " + contact.getPhoneNumber());
        }
        System.out.println(contactName + " not founds in directory!");
    }

    public static void addContact() {
        System.out.println("Enter a contact name: ");
        String contactName = scanner.nextLine();
        contactName = contactName.substring(0, 1).toUpperCase() + contactName.substring(1).toLowerCase();
        Contact contact = mobilePhone.queryContact(contactName);
        if (contact == null) {
            System.out.println("Enter a phone Number");
            String phoneNumber = scanner.nextLine();
            //scanner.nextLine();
            Contact newContact = Contact.createContact(contactName, phoneNumber);
            if (mobilePhone.addNewContact(newContact)) ;
            {
                System.out.println("Contact name: " + contactName + " : " + "Phone Number: " + phoneNumber + " Saved in directory!");
            }
        } else {
            System.out.println(contactName + " already exist in directory!");
        }

    }

    public static void modifyContact() {
        System.out.println("Enter an existing contact name to modify: ");
        String oldContactName = scanner.nextLine();
        oldContactName = oldContactName.substring(0, 1).toUpperCase() + oldContactName.substring(1).toLowerCase();
        Contact oldContact = mobilePhone.queryContact(oldContactName);

        if (oldContact != null) {
            System.out.println("Enter a new contact name: ");
            String newContactName = scanner.nextLine();
            newContactName = newContactName.substring(0, 1).toUpperCase() + newContactName.substring(1).toLowerCase();
            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newContactName, phoneNumber);
            if (mobilePhone.updateContact(oldContact, newContact)) {
                System.out.println("Contact has been updated. ");

            }
        } else {
            System.out.println(oldContactName + " not found in directory");
        }
    }

    public static void deleteContact() {
        System.out.println("Enter contact name to delete: ");
        String contactName = scanner.nextLine();
        contactName = contactName.substring(0, 1).toUpperCase() + contactName.substring(1).toLowerCase();
        Contact contactToDelete = mobilePhone.queryContact(contactName);
        mobilePhone.removeContact(contactToDelete);


    }

    public static void showContact() {
        mobilePhone.printContact();
    }
}