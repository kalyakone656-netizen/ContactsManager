public class Main {
    public static void main(String[] args) {
        ContactsManager manager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Kone";
        c1.phoneNumber = "0102030405";

        manager.addContact(c1);
    }
}