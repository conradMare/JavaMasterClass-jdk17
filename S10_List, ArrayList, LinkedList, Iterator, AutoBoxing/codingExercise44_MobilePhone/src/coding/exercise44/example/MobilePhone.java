package coding.exercise44.example;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return myContact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contact = myContact.get(i);
            if (contact.getContactName().equals(contactName)) {
                return i;
            }
        }
        return -1;

    }

    public boolean addNewContact(Contact contact) {
        int contactIndex = findContact(contact);
        if (contactIndex >= 0) {
            System.out.println("Contact exists in directory");
            return false;
        }

        this.myContact.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex < 0) {
            System.out.println(oldContact.getContactName() + " not found in directory!");
            return false;
        } else if (findContact(newContact.getContactName()) >= 0) {
            System.out.println(newContact.getContactName() + " Already exist in directory!");
            return false;

        }
        this.myContact.remove(oldContactIndex);
        this.myContact.add(oldContactIndex, newContact);
        System.out.println(oldContact.getContactName() + " : " + oldContact.getPhoneNumber() + " was replaced successfully by " + newContact.getContactName() + " : " + newContact.getPhoneNumber());

        return true;

    }

    public boolean removeContact(Contact contactToRemove) {
        int contactIndex = findContact(contactToRemove);
        if (contactIndex < 0) {
            System.out.println("Contact not found!");
            return false;
        }

        this.myContact.remove(contactIndex);
        System.out.println("Contact deleted!");
        return true;
    }

    public Contact queryContact(String name) {
        int nameIndex = findContact(name);
        if (nameIndex >= 0) {
            return (this.myContact.get(nameIndex));
        }

        return null;

    }

    public void printContact() {
        System.out.println("Contact List: \n");
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            System.out.println((i + 1) + ". " + contact.getContactName() + " -> " + contact.getPhoneNumber());
        }
    }

}