package behavioral_patterns.mediator.mediators;

import behavioral_patterns.mediator.colleague.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}