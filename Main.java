public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.setName("Theo");
        contact1.setPhoneNumber("0707070707");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.setName("Awa");
        contact2.setPhoneNumber("0101010101");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.setName("Yao");
        contact3.setPhoneNumber("0202020202");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.setName("Fatou");
        contact4.setPhoneNumber("0303030303");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.setName("Kouassi");
        contact5.setPhoneNumber("0404040404");
        myContactsManager.addContact(contact5);

        Contact result = myContactsManager.searchContact("Awa");

        if(result != null) {
            System.out.println("Nom : " + result.getName());
            System.out.println("Téléphone : " + result.getPhoneNumber());
        } else {
            System.out.println("Contact introuvable");
        }
    }
}