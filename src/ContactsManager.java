public class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
}
