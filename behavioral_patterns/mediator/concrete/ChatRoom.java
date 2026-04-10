package behavioral_patterns.mediator.concrete;

import behavioral_patterns.mediator.mediators.ChatMediator;
import behavioral_patterns.mediator.colleague.User;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}