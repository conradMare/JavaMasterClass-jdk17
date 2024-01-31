package coding.exercise44.example;

public class Contact {
    private String contactName;
    private String phoneNumber;

    public Contact(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String contactName, String phoneNumber) {
        return new Contact(contactName, phoneNumber);
    }
}
