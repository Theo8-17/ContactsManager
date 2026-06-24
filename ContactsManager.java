import java.util.ArrayList;

public class ContactsManager {

    private ArrayList<Contact> contacts;

    public ContactsManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact searchContact(String name) {

        for (Contact contact : contacts) {

            if(contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }

        }

        return null;
    }
}