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
    Contact searchContact(String name){
        for(int i = 0; i < friendsCount; i++){
            if(myFriends[i].name.equals(name)){
                return myFriends[i];
            }
        }
        return null;
    }
}
