package behavioral_patterns.mediator;

import behavioral_patterns.mediator.concrete.ChatRoom;
import behavioral_patterns.mediator.colleague.User;

public class Main {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Ankur", chatRoom);
        User user2 = new User("Rahul", chatRoom);
        User user3 = new User("Amit", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello everyone!");
    }
}