public class Main {
    public static void main(String[] args) {
        ContactsManager manager = new ContactsManager();

        Contact c1 = new Contact();
        c1.name = "Kone";
        c1.phoneNumber = "0102030405";

        manager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Kadi";
        c2.phoneNumber = "0506124872";
        manager.addContact(c2);

        // Contact 3
        Contact c3 = new Contact();
        c3.name = "Jean";
        c3.phoneNumber = "0504080906";
        manager.addContact(c3);

        // Contact 4
        Contact c4 = new Contact();
        c4.name = "christ";
        c4.phoneNumber = "0604081395";
        manager.addContact(c4);

        // Contact 5
        Contact c5 = new Contact();
        c5.name = "yohann";
        c5.phoneNumber = "0505487925";
        manager.addContact(c5);
        Contact result = manager.searchContact("Awa");

        if(result != null){
            System.out.println(result.phoneNumber);
        }
    }
}